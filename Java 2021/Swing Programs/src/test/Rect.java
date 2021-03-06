package test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
public class Rect extends JButton {
	private static final long serialVersionUID = 1L;
	private int stroke = 2, radius = 2;
    private int calWidth, calHeight;
    private Color stokeColor = Color.black, fillColor = Color.red;
    
	public Rect() {
		this.setContentAreaFilled(false);
		this.setBorder(new EmptyBorder(0, 0, 0, 0));
	    this.setFocusable(false);
	    this.setPreferredSize(new Dimension(80, 40));
	}
	
	public Color getFillColor() {  return fillColor;  	}
	public void setFillColor(Color fillColor) {  this.fillColor = fillColor;   }
    public int getRadius() { return radius;   }
	public void setRadius(int radius) {  this.radius = radius;	}
    public void setStrokeWidth(int stroke) { this.stroke = stroke;  }
    public void setStroke(Color color) { this.stokeColor = color; }
    
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D)g;
		//graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2d.setRenderingHints(rh);
        
		calHeight = this.getHeight() - (stroke * 2);
		calWidth = this.getWidth() - (stroke * 2);

		
		//stroke color and width // like as a background color
		graphics2d.setColor(stokeColor);
		graphics2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

	
		/*
		 * graphics2d.translate(180, -80); graphics2d.rotate(Math.PI/ 4);
		 */
		
		//Fill color
		graphics2d.setColor(fillColor);
		graphics2d.fillRoundRect(stroke, stroke, calWidth, calHeight, radius, radius);
		
		
		super.paint(graphics2d);
	}
}
