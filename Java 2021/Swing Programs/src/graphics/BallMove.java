package graphics;

import java.awt.Container;
import javax.swing.JFrame;

public class BallMove {
    public static void main(String[] args) {
		
    	JFrame frame = new JFrame("Animation ");
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	frame.setBounds(0, 100, 1360, 500);
    	frame.setBounds(100, 100, 1000, 500);
    	
    	
    	Container container = frame.getContentPane();
    	System.out.println(container.getHeight()+" "+container.getWidth());
    	
    	Animation2 animation1 = new Animation2(frame.getWidth(), frame.getHeight());
    	frame.getContentPane().add(animation1);
    	
    	
    	
	}
}
