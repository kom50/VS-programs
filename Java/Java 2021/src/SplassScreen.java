import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;

public class SplassScreen {
	public SplassScreen(Frame frame, String str, int delay) {
		Window w1 = new Window(frame);
		w1.setBounds(480, 200, 402, 400);
		w1.setVisible(true);


		JProgressBar p1 = new JProgressBar(1, 100);
		p1.setForeground(new Color(124, 234, 12));
		//         p1.setBounds(5, 0, 390, 20);
		p1.setSize(390, 5);
		p1.setBorder(new LineBorder(Color.blue, 2, true));

		p1.setBorderPainted(false);
		//         p1.setBackground(new Color(255, 0, 234));

		//         p1.getInsets();
		//         p1.setStringPainted(true);
		JLabel l1 = new JLabel("", 0);
		l1.setFont(new Font("Algerian", Font.BOLD, 35));

		JPanel w2 = new JPanel();
		w2.setVisible(true);
		w2.setSize(400, 400);
		w2.setLayout(new BorderLayout());
		w2.setBorder(BorderFactory.createLineBorder(Color.black, 2));

		w2.add(l1);

		w2.setBackground(new Color(25, 0, 30));
		w1.add(w2);
		w2.add(p1, BorderLayout.SOUTH);
		w1.validate();

		Timer t1 = new Timer();
		t1.schedule(new TimerTask() {
			int i = 0, j = 0;
			public void run() {
				i += 2;
				p1.setValue(i);
				if(j != str.length())
					l1.setText(l1.getText()+String.valueOf(str.charAt(j++)));

				if(i == 100) {
					w1.dispose();
					frame.setVisible(true);    				 
					t1.cancel();
				}
				System.out.println("Hello "+i);
			}
		}, 10, delay);
	}
}
