package animation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;

public class TestAnimation extends JFrame {

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
					TestAnimation frame = new TestAnimation();
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
	public TestAnimation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(44, 43, 440, 155);
		contentPane.add(panel);

		panel.revalidate();

		Animation animation = new Animation(panel);
		panel.setLayout(null);

		JLabel lblHelloAnimation = new JLabel("Hello Animation");
		lblHelloAnimation.setBounds(0, 0, 440, 155);
		lblHelloAnimation.setForeground(Color.RED);
		lblHelloAnimation.setFont(new Font("Consolas", Font.BOLD, 22));
		lblHelloAnimation.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloAnimation.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblHelloAnimation.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblHelloAnimation.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(lblHelloAnimation);

		JButton btnAnimation = new JButton("hide");
		btnAnimation.setFocusCycleRoot(true);
		btnAnimation.setFocusTraversalPolicyProvider(true);
		btnAnimation.setFont(new Font("Consolas", Font.BOLD, 18));
		btnAnimation.setForeground(Color.MAGENTA);
		btnAnimation.addActionListener(new ActionListener() {
			boolean flag;

			public void actionPerformed(ActionEvent e) {
				animation.slideToggle(10);
				if (!flag) {
					btnAnimation.setText("Show");
					flag = false;
				} else
					btnAnimation.setText("Hide");
				flag = true;
			}
		});
		btnAnimation.setBackground(Color.BLUE);
		btnAnimation.setBounds(189, 327, 145, 47);
		contentPane.add(btnAnimation);

		JButton btnUp = new JButton("Up");
		Animation animate1 = new Animation(panel);
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animate1.slideUp(10);
			}
		});
		btnUp.setForeground(Color.MAGENTA);
		btnUp.setFont(new Font("Consolas", Font.BOLD, 18));
		btnUp.setFocusTraversalPolicyProvider(true);
		btnUp.setFocusCycleRoot(true);
		btnUp.setBackground(Color.BLUE);
		btnUp.setBounds(26, 335, 125, 39);
		contentPane.add(btnUp);

		JButton btnDown = new JButton("Down");
		Animation animate3 = new Animation(panel);
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animate3.slideDown(10);
			}
		});

		btnDown.setForeground(Color.MAGENTA);
		btnDown.setFont(new Font("Consolas", Font.BOLD, 18));
		btnDown.setFocusTraversalPolicyProvider(true);
		btnDown.setFocusCycleRoot(true);
		btnDown.setBackground(Color.BLUE);
		btnDown.setBounds(359, 338, 125, 39);
		contentPane.add(btnDown);

		Animation animate4 = new Animation(panel);
		JButton btnLeft = new JButton("Left");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animate4.slideLeft(10);
			}
		});
		btnLeft.setForeground(Color.MAGENTA);
		btnLeft.setFont(new Font("Consolas", Font.BOLD, 18));
		btnLeft.setFocusTraversalPolicyProvider(true);
		btnLeft.setFocusCycleRoot(true);
		btnLeft.setBackground(Color.BLUE);
		btnLeft.setBounds(26, 254, 125, 39);
		contentPane.add(btnLeft);

		JButton btnRight = new JButton("Right");
		Animation animate5 = new Animation(panel);
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animate5.slideRight(10);
			}
		});
		btnRight.setForeground(Color.MAGENTA);
		btnRight.setFont(new Font("Consolas", Font.BOLD, 18));
		btnRight.setFocusTraversalPolicyProvider(true);
		btnRight.setFocusCycleRoot(true);
		btnRight.setBackground(Color.BLUE);
		btnRight.setBounds(359, 257, 125, 39);
		contentPane.add(btnRight);

		contentPane.validate();
		this.validate();
	}
}
