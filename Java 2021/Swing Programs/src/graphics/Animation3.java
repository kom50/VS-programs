package graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Animation3 extends Canvas {
    
	private static final long serialVersionUID = 1L;
	int width;
    int height;
    
    int x, y;
	int angle = 0;
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
		
        g2d.setColor(Color.white);
		g2d.fillArc(300, 100, 200, 200, angle, 30);
		g2d.fillArc(300, 100, 200, 200, angle + 120, 30);
		g2d.fillArc(300, 100, 200, 200, angle + 240, 30);
		
		
		// 
		g2d.fillRect(397,  200, 6, 200);
		
		angle = (angle + 30) % 360;		
		
		
		try {
			Thread.sleep(100);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		repaint();
	}
	
	public Animation3(int w, int h) {
		width = w;
		height = h;
		
		this.setBackground(Color.black);
	}
}
