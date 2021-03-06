package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Placeholder extends JPanel{
    
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JTextField field;
	private String msg = "Enter your name";
	Timer timer = null;
	
	public void setPlaceholderText(String msg) {
		this.msg = msg;
		label.setText(msg);
	}
	
	public JTextField getTextField() {
		return field;
	}
	public JLabel getLabel() {
		return label;
	}
	
	public void setTotalSize(int width, int height) {
		this.setSize(width ,height);
		label.setSize(width, height/ 2);
		field.setSize(width, height/ 2);
	}
	
	public Placeholder(String msg) {
		this.msg = msg;
		init();
	}
	
	public Placeholder() {
    	super();
    	init();
	}
	
	private void init() {
		setBounds(10,  10,  155,  60);
    	this.setLayout(null);

    	label = new JLabel(msg);
    	label.setFont(new Font("Consolas", Font.PLAIN, 18));
    	label.setBounds(10,  30,  this.getWidth(),  this.getHeight() / 2);
    	label.setForeground(Color.gray);
    	
    	field = new JTextField();
    	field.setMargin(new Insets(2, 6, 2, 2));
    	field.setHorizontalAlignment(SwingConstants.LEFT);
    	field.setBounds(0,  30,  this.getWidth(),  this.getHeight() / 2);
    	
    	field.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if((field.getText().trim()).isEmpty()) {
					label.setForeground(Color.gray);
					label.setFont(new Font("Dialog", Font.PLAIN, 12));
					label.setLocation(10, 30);
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				label.setLocation(10, 0);
				label.setForeground(Color.black);
				label.setFont(new Font("Consolas", Font.PLAIN, 18));
			}
		});
    	
    	add(label);
    	add(field);
    	
    	this.repaint();
    	this.revalidate();
	}
}
