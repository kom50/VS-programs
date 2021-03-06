package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	  Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(10, 11, 414, 239);
		contentPane.add(tabbedPane);
		
		
		tabbedPane.addTab("C",new JPanel().add(new JLabel("C")));
		JLabel label = new JLabel("C++");
		tabbedPane.addTab("C++", label);
		tabbedPane.addTab("JAVA", new JLabel("Java Programs"));
		tabbedPane.addTab("PYTHON", new JLabel("Python Programs"));
		
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setForeground(Color.red);
		tabbedPane.setSelectedIndex(3);
		
		tabbedPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Selected Tabbed Index : "+tabbedPane.getSelectedIndex());
			}
		});
		System.out.println(tabbedPane.getSelectedIndex());
	}
	

}
