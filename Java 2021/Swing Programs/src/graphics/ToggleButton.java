package graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import code.GradientPanel;
import code.PButton;

public abstract class ToggleButton {

	private GradientPanel box;
	private Color backColor = Color.blue, foreColor = Color.white;
	private PButton btn;

	public void setBackground(Color color) {
		this.backColor = color;
	}

	public void setForeground(Color color) {
		this.foreColor = color;
	}

	public void setLocation(int x, int y) {
		box.setLocation(x, y);
	}
	
	/** the height of toggle button is half of this width  **/
	public ToggleButton(int width, int height) {

		box = new GradientPanel();
		box.setBounds(222, 81, width, height);
		box.setRadius(30);
		box.setStartColor(Color.gray);
		box.setEndColor(Color.gray);
		box.setRadius(height);
		box.setLayout(null);

		btn = new PButton();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn.getX() == 1) {
					btn.setLocation(height, 1);
					box.setStartColor(backColor);
					box.setEndColor(backColor);
					onFunction();
				} else {
					btn.setLocation(1, 1);
					box.setStartColor(Color.gray);
					box.setEndColor(Color.gray);
					offFunction();
				}
			}
		});
		btn.setBounds(1, 1, height - 2, height - 2);
		btn.setBorderRadius(height);
		btn.setStartColor(Color.white);
		box.add(btn);

	}

	// perform action when button on
	public void onFunction() {
		System.out.println("ON");
	}

	// Perform action when button off
	public void offFunction() {
		System.out.println("OFF");
	}

	public void setOn(Container frame1) {
		frame1.add(box);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ToggleButton tglbtn = new ToggleButton(70, 35) {
						@Override
						public void onFunction() {
						//	super.onFunction();
							System.out.println("Hello on");
						}

						@Override
						public void offFunction() {
							//super.offFunction();
							System.out.println("Hello off");

						}

					};

					JFrame frame1 = new JFrame();
					frame1.setVisible(true);
					frame1.setBounds(100, 100, 300, 300);
					frame1.setLayout(null);

					tglbtn.setLocation(100, 100);

					tglbtn.setOn(frame1);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
