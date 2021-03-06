package graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public Game() throws InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(181, 84, 123, 123);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		
		 originalX = panel.getX();
		 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					innerX = panel.getX() + x;
					innerY = panel.getY() + y;
					innerW = panel.getWidth() - x;
					innerH = panel.getHeight()  - y;
					
					outerX = panel.getX() - x;
					outerY = panel.getY() - y;
					outerW = panel.getWidth() + x;
					outerH = panel.getHeight()  + y;
					
				while (true) {
					if(xp <= innerX && yp <= innerY) {
						panel.setBounds(xp++, yp++, (panel.getWidth() - 1), panel.getHeight() -1);
					}else {
						panel.setBounds(xp--, yp--, (panel.getWidth() + 1), panel.getHeight() + 1);
					}
					//if(xp == originalX) {
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					//}
					System.out.println("Hello");
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		btnNewButton.setBounds(183, 292, 89, 23);
		contentPane.add(btnNewButton);
		
	}
	int originalX ;
	int xp = 181, yp = 84, x = 100, y = 100;
	
	int innerX, innerY = 0, outerX, outerY;
	int innerW, innerH, outerW, outerH;
	
}
