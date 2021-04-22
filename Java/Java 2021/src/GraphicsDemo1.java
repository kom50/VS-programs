import javax.swing.*;
import java.awt.*;

class GraphicsDemo1 extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public GraphicsDemo1() {
		super("Graphics program in Swing");
		setBounds(60, 30, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setBackground(Color.WHITE);
		validate();
	}

	public void paint(Graphics g) {
		g.setPaintMode();
		g.translate(10, 23);
		g.setColor(new Color(122, 233, 90));
		g.drawRect(10, 70, 150, 120);

		g.setFont(new Font("Arial", Font.BOLD, 24));
		g.drawString("Hello Graphics", 100, 50);
		// g.
		g.setColor(Color.red);
		g.fillRoundRect(70, 230, 190, 100, 80, 50);
		// ToolKit t = ;
		Image img = Toolkit.getDefaultToolkit().getImage("G://VS programs/Java/Java 2021/src/r.jpg");
		setIconImage(img);
		g.drawImage(img, 300, 200, Color.RED, this);
		validate();
	}

	public static void main(String[] args) {
		new GraphicsDemo1();
	}
}