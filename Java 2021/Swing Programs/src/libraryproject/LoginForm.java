package libraryproject;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import code.OnDrag;
import code.PButton;

public class LoginForm extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userNameField;
	private JPasswordField passwordField;
	
//	private int x, y;  

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setBackground(Color.WHITE);
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\library_32.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				contentPane.setBackground(Color.green);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				contentPane.setBackground(new Color(240, 240, 240));
			}
		});
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUserName = new JLabel("Enter Password : ");
		lblEnterUserName.setForeground(new Color(255, 69, 0));
		lblEnterUserName.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblEnterUserName.setBounds(61, 254, 105, 25);
		contentPane.add(lblEnterUserName);
		
		JLabel label_1 = new JLabel("Enter User Name : ");
		label_1.setForeground(new Color(255, 69, 0));
		label_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		label_1.setBounds(61, 220, 105, 25);
		contentPane.add(label_1);
		
		userNameField = new JTextField();
		userNameField.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		userNameField.setToolTipText("user name\r\n");
		userNameField.setBounds(176, 222, 140, 25);
		contentPane.add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		passwordField.setBounds(176, 256, 140, 23);
		contentPane.add(passwordField);
				
		PButton btnLogin = new PButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			Account account;
			public void actionPerformed(ActionEvent e) {
				
				account = (Account) Account.readData();
				
				if(!userNameField.getText().isEmpty() && passwordField.getPassword().length != 0) {
					if(userNameField.getText().equals(account.getUserName()) && String.valueOf(passwordField.getPassword()).equals(account.getPassword())) {
						System.out.println("Connection successfull");
					}else {
						System.out.println("Unable to connect ");
					}				
				}
			}
		});
		btnLogin.setBounds(88, 325, 200, 41);
		btnLogin.setEndColor(Color.GREEN);
		btnLogin.setStartColor(Color.blue);
		btnLogin.setFont(new Font("mono", Font.PLAIN, 18));
		
		btnLogin.setHoverColor(Color.green);
		btnLogin.setBorderRadius(30);
		contentPane.add(btnLogin);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\account_60px.png"));
		label_2.setBounds(158, 104, 60, 78);
		contentPane.add(label_2);
		
		JLabel lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setEnabled(false);
		lblCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCreateAccount.setForeground(Color.BLUE);
		lblCreateAccount.setBounds(201, 377, 94, 25);
		contentPane.add(lblCreateAccount);
		
		JLabel backgroundImage = new JLabel("");
		backgroundImage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
	    new OnDrag(backgroundImage, this);
	    
		/*
		 * BackgroundImage.addMouseMotionListener(new MouseMotionAdapter() {
		 * 
		 * @Override public void mouseDragged(MouseEvent e) {
		 * Form1.this.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y); } });
		 */
		
		
		
		/*
		 * BackgroundImage.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseClicked(MouseEvent e) { int count =
		 * e.getClickCount(); if(count == 2) Form1.this.dispose(); }
		 * 
		 * @Override public void mousePressed(MouseEvent e) { x = e.getX(); y =
		 * e.getY(); }
		 * 
		 * });
		 */
		
		JLabel forgatPass = new JLabel("Forgot Password");
		forgatPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		forgatPass.setHorizontalAlignment(SwingConstants.LEFT);
		forgatPass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		forgatPass.setForeground(Color.BLUE);
		forgatPass.setBounds(88, 377, 118, 25);
		contentPane.add(forgatPass);
		
		JLabel lblX = new JLabel("  X");
		lblX.setForeground(new Color(0, 255, 0));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginForm.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.GREEN);
			}
		});
		lblX.setFont(new Font("Arial", Font.BOLD, 18));
		lblX.setBounds(334, 11, 25, 14);
		contentPane.add(lblX);
		backgroundImage.setIcon(new ImageIcon("C:\\Users\\Omkarthik\\Pictures\\FormBackground.png"));
		backgroundImage.setBounds(4, 2, 366, 507);
		contentPane.add(backgroundImage);
	}
}
