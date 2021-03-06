package test;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ToolBarTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Box horizontalBox = Box.createHorizontalBox();

	private boolean flag = true;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolBarTest frame = new ToolBarTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ToolBarTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBounds(0, 0, 89, 64);
		addPopup(contentPane, popupMenu);
		
		JMenuItem mntmUndu = new JMenuItem("Undu");
		popupMenu.add(mntmUndu);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		popupMenu.add(mntmCut);
	
		JToolBar toolBar = new JToolBar();
		toolBar.setBorderPainted(true);
		toolBar.setBorder(new LineBorder(Color.RED, 3, true));
		
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(56, 0, 278, 172);
		contentPane.add(toolBar);
		
		JLabel lblLabel_1 = new JLabel("Label1");
		toolBar.add(lblLabel_1);
		
		JLabel lblLabel = new JLabel("Label");
		toolBar.add(lblLabel);
		horizontalBox.setBounds(374, 50, 213, 152);
		contentPane.add(horizontalBox);
		
		
		JToggleButton tglbtnOn = new JToggleButton("ON");
		tglbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag) {
					flag = false;
					tglbtnOn.setText("OFF");
				}else {
					flag = true;
					tglbtnOn.setText("ON");
				}
			}
		});
		tglbtnOn.setBounds(387, 24, 121, 23);
		contentPane.add(tglbtnOn);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(editorPane.getCaretPosition());
			}
		});
		System.out.println(editorPane.getCaretPosition());;
		editorPane.setBounds(56, 195, 263, 93);
		contentPane.add(editorPane);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
