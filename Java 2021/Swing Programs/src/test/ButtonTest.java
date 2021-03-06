package test;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ButtonTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest frame = new ButtonTest();
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
	public ButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(5, 245, 497, 23);
		contentPane.add(btnNewButton);
		
		PButton btnButton = new PButton("Programming.OM");
		btnButton.setBounds(112, 35, 225, 53);
		btnButton.setBorderRadius(20);
		btnButton.setFont(new Font("Consolus", Font.BOLD, 20));
		btnButton.setStartColor(Color.RED);
		btnButton.setEndColor(Color.yellow);
		btnButton.setHoverColor(new Color(12, 34, 153));
		btnButton.setPressedColor(Color.LIGHT_GRAY);
		btnButton.setStartX(10);
		btnButton.setStartY(110);
		btnButton.setEndY(200);

//		btnButton.set

		contentPane.add(btnButton);
		
		PButton btnButton_1 = new PButton();
		btnButton_1.setBounds(143, 212, -71, -33);
		contentPane.add(btnButton_1);
		
		PButton btnFbbf = new PButton();
		btnFbbf.setBounds(200, 131, 121, 70);
		contentPane.add(btnFbbf);
		
		PButton btnBuuton = new PButton();
		btnBuuton.setBounds(370, 35, 113, 56);
		contentPane.add(btnBuuton);
		
		/*
		 * HintTextField hintTextField = new HintTextField((String) null);
		 * hintTextField.setBounds(370, 145, 7, 20); contentPane.add(hintTextField);
		 */
		
		GradientPanel panel = new GradientPanel();
		panel.setBounds(143, 298, 200, 100);
		contentPane.add(panel);
		
		
		
	}
}
