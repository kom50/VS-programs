package animation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.util.Locale;
import java.awt.Component;

public class HideShow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
//	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HideShow frame = new HideShow();
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
	Timer timer;
	JButton btnHide;
	private JButton btnButton_1;
	private JButton btnButton_2;
	private JButton btnButton;
	
	public HideShow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(10, 0, 621, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnButton_1 = new JButton("Button 2");
		btnButton_1.setLocale(new Locale("af"));
		btnButton_1.setIconTextGap(30);
		btnButton_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButton_1.setHideActionText(true);
		btnButton_1.setForeground(Color.WHITE);
		btnButton_1.setFont(new Font("Consolas", Font.BOLD, 16));
		btnButton_1.setFocusable(false);
		btnButton_1.setBorder(null);
		btnButton_1.setBackground(new Color(173, 255, 47));
		btnButton_1.setBounds(226, 111, 166, 48);
		panel.add(btnButton_1);
		
		btnButton_2 = new JButton("Button 3");
		btnButton_2.setLocale(new Locale("af"));
		btnButton_2.setIconTextGap(30);
		btnButton_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButton_2.setHideActionText(true);
		btnButton_2.setForeground(Color.WHITE);
		btnButton_2.setFont(new Font("Consolas", Font.BOLD, 16));
		btnButton_2.setFocusable(false);
		btnButton_2.setBorder(null);
		btnButton_2.setBackground(Color.BLUE);
		btnButton_2.setBounds(226, 187, 166, 48);
		panel.add(btnButton_2);
		
		btnButton = new JButton("Button 1");
		btnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnButton.setLocale(new Locale("af"));
		btnButton.setIconTextGap(30);
		btnButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnButton.setHideActionText(true);
		btnButton.setForeground(new Color(0, 0, 255));
		btnButton.setFont(new Font("Consolas", Font.BOLD, 16));
		btnButton.setFocusable(false);
		btnButton.setBorder(null);
		btnButton.setBackground(Color.CYAN);
		btnButton.setBounds(226, 44, 166, 48);
		panel.add(btnButton);
		
//		initHeight = panel.getHeight();
		ActionListener action = new ActionListener() {
			boolean flag = true;
			int initHeight =panel.getHeight();
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Timer is running...");
				if(flag) {
					panel.setSize(panel.getWidth(), panel.getHeight() - 1);
					if(panel.getHeight() == 0) {
						flag = false;
						btnHide.setText("Show");				
					}
				}else {
					panel.setSize(panel.getWidth(), panel.getHeight() + 1);
					if(panel.getHeight() == initHeight) {
						flag = true;
						btnHide.setText("Hide");						
					}
				}
				if(panel.getHeight() == 0 || panel.getHeight() == initHeight) {
					timer.stop();
					System.out.println("Timer is stoped...");
				}
			}
		};
		timer = new Timer(30, action);
		
		btnHide = new JButton("Hide");
		btnHide.setLocale(new Locale("af"));
		btnHide.setIconTextGap(30);
		btnHide.setHideActionText(true);
		btnHide.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnHide.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\library_16.png"));
		btnHide.setForeground(Color.WHITE);
		btnHide.setFont(new Font("Consolas", Font.BOLD, 16));
		btnHide.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnHide.setBorder(new MatteBorder(0, 3, 0, 0, Color.white));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnHide.setBorder(new MatteBorder(0, 0, 0, 0, Color.white));
				
			}
		});
		btnHide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();			
				
			}
		});
		
		
		btnHide.setFocusable(false);
		btnHide.setBorder(null);
		btnHide.setBackground(Color.BLUE);
		btnHide.setBounds(231, 306, 166, 48);
		contentPane.add(btnHide);
	}

}
