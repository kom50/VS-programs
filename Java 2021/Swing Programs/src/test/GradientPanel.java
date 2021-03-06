package test;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
public class GradientPanel extends JPanel {
   
	private static final long serialVersionUID = 1L;
	private Color startColor = Color.BLACK, endColor = Color.white;
    private int startX = 0, endX = 100, startY = 0, endY  = 100;
    
    public int getStartX() { return startX; 	}
	public void setStartX(int startX) {	this.startX = startX;	}
	public int getEndX() {	return endX; 	}
	public void setEndX(int endX) { 	this.endX = endX;	}
	public int getStartY() {  return startY;	}
	public void setStartY(int startY) { this.startY = startY;	}
	public int getEndY() {	return endY;	}
	public void setEndY(int endY) {	this.endY = endY;	}
	
	public void setStartColor(Color startColor) {  this.startColor = startColor;   }
    public void setEndColor(Color endColor) { this.endColor = endColor;   }
    
    public GradientPanel() {
    	//this.setPreferredSize(new Dimension(100, 100));
//    	this.setBackground(Color.red);
    	this.setLayout(new FlowLayout());
    }
    
    int theta = 150;
    public void setTheta(int d) {
    	theta = d;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        endY = getHeight();
        endX  = getWidth();
        Paint paint = new GradientPaint(startX, startY, startColor, endX, endY, endColor, true);
        graphics2D.setPaint(paint);
   
        graphics2D.rotate(theta);
        
        graphics2D.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 20, 20);
        
//        super.paintComponent(graphics2D); this line is not necessary
    }
    
    
    public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(110, 50, 600, 600);
		frame.setVisible(true);
		frame.setLayout(null);
		
		GradientPanel panel = new GradientPanel();
		panel.setBounds(10, 10, 400, 400);
		
		JSlider slider = new JSlider();
		slider.setBounds(30, 510, 300, 10);
		slider.setMinimum(100);
		slider.setMaximum(360);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				panel.setTheta(slider.getValue());
				System.out.println(slider.getValue());
			}
		});
		
		Container contentPane = frame.getContentPane();
		contentPane.add(panel);
		contentPane.add(slider);
		
		contentPane.validate();
		
	}
}

