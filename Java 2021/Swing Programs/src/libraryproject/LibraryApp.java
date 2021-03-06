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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import code.OnDrag;
import code.PButton;

public class LibraryApp extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblLibraryManagementSystem;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryApp frame = new LibraryApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the frame.
	 */
	public LibraryApp() {
		setUndecorated(true);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\library_32.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setBounds(100, 100, 1000, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0, 0));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.WHITE));
		setContentPane(contentPane);

		// set Drag listener
		new OnDrag(contentPane, this);

		contentPane.setLayout(null);
		// Close button
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LibraryApp.this.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
//				lblX.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\closeRed_32.png"));
				lblX.setForeground(Color.red);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				lblX.setForeground(Color.white);
//				lblX.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\closeWhite_16.png"));
			}
		});

		JLabel label = new JLabel("");
		label.setBounds(10, 11, 26, 25);
		contentPane.add(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println("Hello button");
				LibraryApp.this.setState(JFrame.ICONIFIED);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				label.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\mnimiseRed.png"));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
				label.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\minimise_16.png"));
			}

		});
		label.setIcon(new ImageIcon("G:\\VS programs\\Java 2021\\Swing Programs\\src\\Image\\minimise_16.png"));
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblX.setBounds(974, 11, 16, 14);
		contentPane.add(lblX);

		lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GREEN));
		lblLibraryManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibraryManagementSystem.setForeground(Color.GREEN);
		lblLibraryManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLibraryManagementSystem.setBounds(131, 7, 741, 64);
		contentPane.add(lblLibraryManagementSystem);

		Font font = new Font("Century", Font.PLAIN, 20);

		JPanel semesterPanel = new JPanel();
		semesterPanel.setBounds(-10, 71, 1000, 553);
		contentPane.add(semesterPanel);
		semesterPanel.setBackground(new Color(0, 0, 0, 0));
		semesterPanel.setLayout(null);

		PButton semester1 = new PButton("Semester 1");

		Semester1Panel semester1Panel = new Semester1Panel();
		semester1Panel.setBounds(0, 71, 980, 553);
		semester1Panel.setVisible(false);
		contentPane.add(semester1Panel);

		semester1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				semester1Panel.setVisible(true);
				semesterPanel.setVisible(false);

			}
		});
		semester1.setFont(font);
		semester1.setBounds(358, 95, 277, 46);
		semesterPanel.add(semester1);

		PButton semester2 = new PButton("Semester 2");
		semester2.setBounds(358, 161, 277, 46);
		semester2.setFont(font);
		semesterPanel.add(semester2);

		PButton semester3 = new PButton("Semester 3");
		semester3.setFont(font);
		semester3.setBounds(358, 218, 277, 46);
		semesterPanel.add(semester3);

		PButton semester4 = new PButton("Semester 4");
		semester4.setFont(font);
		semester4.setBounds(358, 275, 277, 46);
		semesterPanel.add(semester4);

		PButton semester5 = new PButton("Semester 5");
		semester5.setBounds(358, 341, 277, 46);
		semester5.setFont(font);
		semesterPanel.add(semester5);

		PButton semester6 = new PButton("Semester 6");
		semester6.setBounds(358, 398, 277, 46);
		semester6.setFont(font);
		semesterPanel.add(semester6);

		// start Color or end color
		semester1.setStartColor(Color.red);
		semester1.setEndColor(Color.magenta);
		semester2.setStartColor(Color.red);
		semester2.setEndColor(Color.magenta);
		semester3.setStartColor(Color.red);
		semester3.setEndColor(Color.magenta);
		semester4.setStartColor(Color.red);
		semester4.setEndColor(Color.magenta);
		semester5.setStartColor(Color.red);
		semester5.setEndColor(Color.magenta);
		semester6.setStartColor(Color.red);
		semester6.setEndColor(Color.magenta);

		semester1.setStartX(60);
		semester2.setStartX(50);
		semester3.setStartX(40);
		semester4.setStartX(30);
		semester5.setStartX(20);
		semester6.setStartX(10);

		semester1.setBorderRadius(20);
		semester2.setBorderRadius(20);
		semester3.setBorderRadius(20);
		semester4.setBorderRadius(20);
		semester5.setBorderRadius(20);
		semester6.setBorderRadius(20);

		JLabel backgroundImg = new JLabel("");
		// backgroundImg.setBackground(new Color(0, 0, 0, 0));
		backgroundImg.setIgnoreRepaint(true);
		backgroundImg.setIcon(new ImageIcon("C:\\Users\\Omkarthik\\Pictures\\form2.jpg"));
		backgroundImg.setBounds(0, 0, 1000, 635);
		contentPane.add(backgroundImg);

		contentPane.validate();
		this.validate();

	}
}
