package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Animation1 extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int maxX, maxY;
	int stepSize = 15;
	
	int x = 10, y = 100;
	int width = 100, height = 40;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
		
		if(x + width > maxX || x < 0)
			stepSize = -stepSize;
		
		x = x + stepSize;
		try {
			Thread.sleep(10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Paint method");
		
		repaint();
		
	}

	Animation1(int x, int y){
		maxX = x;
		maxY = y;
		
		this.setBackground(Color.black);
	}
}
