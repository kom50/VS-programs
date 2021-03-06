package libraryproject;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import code.HintTextField;
import code.OnDrag;
import code.PButton;

public class CerateAccountPage extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Account account = new Account();
	
	/* Launch the application.  */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CerateAccountPage frame = new CerateAccountPage();
					frame.setVisible(true);
//					frame.setIconImage(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\library_32.png").getImage());
					
					frame.setLocationRelativeTo(null);  
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CerateAccountPage() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\library_32.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 524);
		contentPane = new JPanel();
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
				
		PButton btnLogin = new PButton("Create Account");
		
		btnLogin.setBounds(116, 403, 160, 32);
		btnLogin.setEndColor(Color.GREEN);
		btnLogin.setStartColor(Color.blue);
		btnLogin.setFont(new Font("mono", Font.PLAIN, 16));
		
		btnLogin.setHoverColor(Color.green);
		btnLogin.setBorderRadius(30);
		contentPane.add(btnLogin);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\account_60px.png"));
		logo.setBounds(159, 76, 60, 78);
		contentPane.add(logo);
		
		JLabel lblX = new JLabel("  X");
		lblX.setForeground(new Color(0, 255, 0));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CerateAccountPage.this.dispose();
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
		lblX.setBounds(345, 22, 25, 14);
		contentPane.add(lblX);
		
		HintTextField userNameField = new HintTextField((String) "Enter user name");
		userNameField.setBounds(94, 295, 200, 25);
		contentPane.add(userNameField);
		
		HintTextField passwordField = new HintTextField((String) "Enter password");
		passwordField.setBounds(94, 331, 200, 25);
		passwordField.setPasswordField(true);
		contentPane.add(passwordField);
		
		HintTextField reEnterField = new HintTextField((String) "Re-enter password");
		reEnterField.setBounds(94, 367, 200, 25);
		reEnterField.setPasswordField(true);
		contentPane.add(reEnterField);
		
		HintTextField dbUserName = new HintTextField("Enter Database user name");
		dbUserName.setBounds(94, 176, 200, 25);
		contentPane.add(dbUserName);
		
		HintTextField dbPassword = new HintTextField("Enter Database password");
		dbPassword.setBounds(94, 213, 200, 25);
		dbPassword.setPasswordField(true);
		contentPane.add(dbPassword);
		
		JLabel lblDatabaseDetails = new JLabel("Database Details");
		lblDatabaseDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDatabaseDetails.setBounds(73, 152, 111, 25);
		contentPane.add(lblDatabaseDetails);
		
		JRadioButton rdbtnOracle = new JRadioButton("Oracle");
		rdbtnOracle.setBackground(new Color(255, 255, 255));
		rdbtnOracle.setSelected(true);
		rdbtnOracle.setBounds(94, 245, 101, 23);
		contentPane.add(rdbtnOracle);
		
		JRadioButton rdbtnMysql = new JRadioButton("MySQL");
		rdbtnMysql.setBackground(new Color(255, 255, 255));
		rdbtnMysql.setBounds(197, 245, 95, 23);
		contentPane.add(rdbtnMysql);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnOracle);
		bg.add(rdbtnMysql);
				
				
		JLabel lblUserDetails = new JLabel("User Details");
		lblUserDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserDetails.setBounds(73, 275, 89, 14);
		contentPane.add(lblUserDetails);
		
		//
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dbUName = dbUserName.getText();
				String dbPassword1 = dbPassword.getPassword();
				String  uName = userNameField.getText();
				String password = passwordField.getPassword();
				String rePass = reEnterField.getPassword();
				String dbName = "";
				if(rdbtnOracle.isSelected())
					 dbName = "Oracle";
				else
					dbName = "MySQL";
					 
				if(!dbUName.isEmpty() && !dbPassword1.isEmpty() && !dbName.isEmpty() && !uName.isEmpty() && !password.isEmpty() && password.equals(rePass)) {
					account = new Account(dbUName, dbPassword1, dbName, uName, password);
					
					Account.writeData(account);
     			}else {
     				System.out.println("Error");
     				JOptionPane.showMessageDialog(CerateAccountPage.this, "Error");
     			}
			}
		});
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\icons8_database_16.png"));
		label_1.setBounds(51, 163, 25, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\icons8_user_16.png"));
		label_2.setBounds(51, 276, 16, 13);
		contentPane.add(label_2);
		
		PButton button = new PButton("Show details ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("REad Details");
				try {
					account = (Account) Account.readData();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				System.out.println("account.getDbUserName() : "+account.getDbUsserName());
				System.out.println("account.getDbName() : "+account.getDbName());
				System.out.println("account.getDbPassword : "+account.getDbPassword());
								System.out.println("account.getUserName() : "+account.getUserName());
				System.out.println("account.getPassword() : "+account.getPassword());
			}
		});
		button.setBounds(94, 465, 74, 32);
		contentPane.add(button);
		
		
		
		JLabel backgroundImage = new JLabel("MySQL");
		backgroundImage.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		// add OnDrag listener
		new OnDrag(backgroundImage, this);
		
		backgroundImage.setIcon(new ImageIcon("C:\\Users\\Omkarthik\\Pictures\\Projects photo\\form1.png"));
		backgroundImage.setBounds(10, 11, 360, 507);
		contentPane.add(backgroundImage);
	}
}
