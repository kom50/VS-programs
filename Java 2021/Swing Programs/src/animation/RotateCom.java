package animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RotateCom extends JPanel {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		RotateCom r = new RotateCom();
		r.setBounds(30, 40, 300, 300);
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 500, 500);

		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(r);
		frame.validate();
	}

	public RotateCom() {

		this.setBounds(20, 10, 300, 300);
		this.setBackground(Color.white);

	}

	@Override
	protected void printComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D graphics2D = (Graphics2D) g;
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		graphics2D.setPaint(Color.red);
		graphics2D.fillRect(0, 0, getWidth(), getHeight());

		super.paintComponent(graphics2D);
		/*
		 * super.printComponent(g);
		 * 
		 * Graphics2D g2d = (Graphics2D) g.create(); //g2d.rotate(Math.toRadians(50),
		 * this.getWidth()/ 2, this.getHeight() / 2); g2d.setColor(Color.red);
		 * g2d.drawRect(this.getX() + 30, this.getY() + 30,this.getWidth() - 60,
		 * this.getHeight() - 60);
		 * 
		 * super.paintComponent(g2d);
		 */
		System.out.println("Hello");
	}
}
