package graphics;

import java.awt.Container;
import java.awt.Window;

import javax.swing.JFrame;

public class TestAnimation {
    public static void main(String[] args) {
		
    	JFrame frame = new JFrame("Animation ");
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setBounds(0, 100, 1360, 500);
    	
    	
    	Container container = frame.getContentPane();
    	System.out.println(container.getHeight()+" "+container.getWidth());
    	
    	Animation1 animation1 = new Animation1(frame.getWidth(), 500);
    	frame.getContentPane().add(animation1);
    	
    	
    	
	}
}
