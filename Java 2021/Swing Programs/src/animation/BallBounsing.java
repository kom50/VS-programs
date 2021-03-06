package animation;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Image.PButton;


public class BallBounsing extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
   /* Launch the application.	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BallBounsing frame = new BallBounsing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//
	
	Random rand = new Random();
	int x = 253, y = 97, nextX = rand.nextInt(30), nextY = rand.nextInt(30);

	
	/* Create the frame.	 */
	public BallBounsing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 509);
//		setLocationByPlatform(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		PButton button = new PButton();
		button.setBounds(253, 97, 50, 50);
		button.setBorderRadius(50);
		contentPane.add(button);
		
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(x < nextX) {
					x++;
				}else {
					x--;
				}
				if(y < nextY) {
					y++;
				}else {
				   y--;
				}
				if(x == nextX || y == nextY) {
					nextX = rand.nextInt(830);
					nextY = rand.nextInt(500);
				}
				
				button.setLocation(x, y);
				System.out.println(nextX+"   "+nextY);
			}
		};
				
		Timer timer = new Timer(10, action);
		
		
		PButton button_1 = new PButton("Stop");
		button_1.setBounds(459, 121, 94, 36);
		contentPane.add(button_1);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		
		PButton button_2 = new PButton("Start");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		button_2.setBounds(28, 121, 94, 36);
		contentPane.add(button_2);
		
	}
}
