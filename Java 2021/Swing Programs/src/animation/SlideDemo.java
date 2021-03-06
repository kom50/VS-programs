package animation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SlideDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlideDemo frame = new SlideDemo();
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
	String direction;
	Timer timer;

	public SlideDemo() {
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(156, 88, 244, 204);
		contentPane.add(panel);

		JButton btnLeft = new JButton("Left");

		ActionListener action = new ActionListener() {
			int initWidth = panel.getWidth();

			// initX = panel.getX();
			public void actionPerformed(ActionEvent e) {
				// switch(direction) {
				// case "left" :
				if (direction.equals("left")) {

					if (panel.getWidth() <= initWidth) {
						panel.setLocation(panel.getX() - 1, panel.getY());
						panel.setSize(panel.getWidth() + 1, panel.getHeight());
						System.out.println("Else");

					} else {
						panel.setSize(panel.getWidth() - 1, panel.getHeight());
					}
					System.out.println("timer is running..." + direction);
				}

				// break;
				// case "right":
				if (direction.equals("right")) {
					if (panel.getWidth() == 0) {
						// panel.setLocation(initX - 1, panel.getY());
						panel.setSize(panel.getWidth() + 1, panel.getHeight());

					} else {
						panel.setLocation(panel.getX() + 1, panel.getY());
						panel.setSize(panel.getWidth() - 1, panel.getHeight());

					}
					// j++;

				}

				if (panel.getWidth() == 0 || panel.getWidth() == initWidth) {
					// panel.setSize(initWidth, panel.getHeight());
					// panel.setLocation(initX, panel.getY());
					timer.stop();
					System.out.println("timer is stoped...");

				}
				// break;
				// }
			}
		};
		timer = new Timer(10, action);

		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// timer.stop();
				timer.start();
			}
		});

		JButton btnRight = new JButton("Right");
		btnRight.setBounds(425, 345, 89, 23);
		contentPane.add(btnRight);

		btnRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				direction = "right";
				// timer.stop();
				timer.start();
			}
		});

		btnLeft.setBounds(66, 345, 89, 23);
		contentPane.add(btnLeft);

	}

	private static void delay(long d) {
		for (int i = 0; i < d * 50000; i++)
			;
	}
}
