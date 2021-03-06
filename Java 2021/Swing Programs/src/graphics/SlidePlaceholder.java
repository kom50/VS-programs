package graphics;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

public class SlidePlaceholder extends JFrame {

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
					SlidePlaceholder frame = new SlidePlaceholder();
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
	public SlidePlaceholder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Placeholder field = new Placeholder("Enter your name ");
		field.setTotalSize(200, 60);
		contentPane.add(field);
		
		Placeholder field1 = new Placeholder("Enter your age");
		field1.setTotalSize(200, 60);
		field1.setLocation(128, 135);
		field.setLocation(128, 64);
		contentPane.add(field1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(135, 254, 148, 31);
		contentPane.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				    JTextField text = field.getTextField();
				    JTextField text1 = field1.getTextField();
					System.out.println("Name "+text.getText()+", age : "+text1.getText());
			}
		});
		
	}
}
