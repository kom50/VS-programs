import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SplashScreen extends JWindow {

	private JPanel contentPane;
	
	public SplashScreen(JFrame frame, String msg){
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((int)frame.getLocation().getX()+ 350, (int)frame.getLocation().getY() + 100, 550, 350);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(125, 241, 99));
		
		
		
		setContentPane(contentPane);
		
		//Add progressBar
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		contentPane.add(progressBar, BorderLayout.SOUTH);
		
		JLabel lblHello = new JLabel("");
		lblHello.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHello.setForeground(Color.RED);
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setText(msg);
		contentPane.add(lblHello, BorderLayout.CENTER);
		setVisible(true);
		Timer t1 = new Timer();
		t1.schedule(new TimerTask() {
			int n = 0;
			@Override
			public void run() {
				n += 2;
				progressBar.setValue(n);
				if(n == 100) {
					frame.setVisible(true);
					SplashScreen.this.dispose();
				}
			}
				
		},1000, 100);
		
		
	}

}
