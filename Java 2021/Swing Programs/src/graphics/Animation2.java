package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

// Ball move 
public class Animation2 extends Canvas{
   
	private static final long serialVersionUID = 1L;
	int width, height;
	
	int x = 0, y = 0;
	int stepX = 10, stepY = 10;
	
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.white);
		g.fillOval(x, y, 50, 50);
		
		g.fillRect(120, 110, 100, 10);
		
		if(x + 50 > width || x < 0  )
			stepX = -stepX;
		
		if(y + 100 > height || y < 0  )
			stepY = -stepY;
		
		x = x + stepX;
	    y = y + stepY;	
	    
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		repaint();
		System.out.println("Paint ");
	}
	
	public Animation2(int width, int height) {
		this.width  = width;
		this.height = height;
		this.setBackground(Color.black);
	}
}
