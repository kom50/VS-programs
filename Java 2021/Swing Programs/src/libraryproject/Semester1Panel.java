package libraryproject;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;

import code.PButton;

public class Semester1Panel extends JPanel {

	private static final long serialVersionUID = 1L;

	public Semester1Panel() {
		System.out.println("Semester 1 PAge");
		this.setBounds(10, 82, 980, 542);
		this.setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		Font font = new Font("Century", Font.PLAIN, 16);
		
		PButton button = new PButton("Add Book Details");
		button.setBounds(43, 112, 212, 42);
		button.setStartColor(Color.green);
		add(button);
		
		PButton button_1 = new PButton("Show All Book Details");
		button_1.setBackground(Color.green);
		button_1.setBounds(43, 171, 212, 42);
		add(button_1);
		
		PButton button_2 = new PButton();
		button_2.setBounds(43, 236, 212, 42);
		add(button_2);
		
		PButton button_3 = new PButton();
		button_3.setBounds(43, 299, 212, 42);
		add(button_3);
		
		PButton button_4 = new PButton();
		button_4.setBounds(43, 361, 212, 42);
		add(button_4);
		
		button.setStartColor(Color.green);
		button_1.setStartColor(Color.green);
		button_2.setStartColor(Color.green);
		button_3.setStartColor(Color.green);
		button_4.setStartColor(Color.green);
		
	
		
		button.setGradient(false);
		button_1.setGradient(false);
		button_2.setGradient(false);
		button_3.setGradient(false);
		button_4.setGradient(false);
		
		button.setBorderRadius(42);
		button_1.setBorderRadius(42);
		button_2.setBorderRadius(42);
		button_3.setBorderRadius(42);
		button_4.setBorderRadius(50);
		
		button.setFont(font);
		button_1.setFont(font);
		button_2.setFont(font);
		button_3.setFont(font);
		button_4.setFont(font);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0, 0));
		panel.setBounds(301, 11, 669, 520);
		add(panel);
	}
}
