package test;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormData frame = new FormData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	int x, y;
	private JTextField textField;
	private JPasswordField passwordField;
	public FormData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 423);
		contentPane = new JPanel();
		
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				FormData.this.setLocation(new Point(e.getXOnScreen()- x,e.getYOnScreen() -  y));
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
//				System.out.println("x "+e.getX()+" X screen "+e.getXOnScreen());
			}
		});
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUserName = new JLabel("Enter  User Name : ");
		lblEnterUserName.setFont(new Font("Century", Font.BOLD, 14));
		lblEnterUserName.setForeground(new Color(255, 255, 255));
		lblEnterUserName.setBounds(173, 166, 165, 37);
		contentPane.add(lblEnterUserName);
		
		JLabel lblEnterPassword = new JLabel("Enter  Password : ");
		lblEnterPassword.setFont(new Font("Century", Font.BOLD, 14));
		lblEnterPassword.setForeground(new Color(255, 255, 255));
		lblEnterPassword.setBounds(173, 210, 125, 37);
		contentPane.add(lblEnterPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(327, 172, 156, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBackground(new Color(255, 255, 255));
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(327, 215, 156, 30);
		contentPane.add(passwordField);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FormData.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.black);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblX.setBounds(643, 11, 15, 18);
		contentPane.add(lblX);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\account_60px.png"));
		logo.setBounds(287, 55, 109, 100);
		contentPane.add(logo);
		
		PButton btnLogin = new PButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(346, 276, 137, 37);
		btnLogin.setStartColor(Color.yellow);
		btnLogin.setEndColor(Color.blue);
		
		btnLogin.setFont(new Font("Century", Font.BOLD, 16));
		
		btnLogin.setBorderRadius(35);
		
		
		contentPane.add(btnLogin);
		
		PButton btnReset = new PButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setBounds(181, 276, 137, 37);
		btnReset.setBorderRadius(35);
		btnReset.setStartColor(Color.blue);
		btnReset.setStartPoint(140, 0);
		btnReset.setFillButton(false);
		btnReset.setHoverColor(Color.white);
		btnReset.setFont(new Font("Century", Font.BOLD, 16));
		btnReset.setHorizontalTextPosition(SwingConstants.CENTER);
		contentPane.add(btnReset);
		
		JLabel backgroundImg = new JLabel("");
		backgroundImg.setBorder(new EmptyBorder(0, 0, 1, 0));
		backgroundImg.setIcon(new ImageIcon("C:\\Users\\Omkarthik\\Downloads\\background-2203989_1920.jpg"));
		backgroundImg.setBounds(0, 0, 678, 423);
		contentPane.add(backgroundImg);
		this.setUndecorated(true);
		
		setBackground(Color.BLUE);
	}
}
