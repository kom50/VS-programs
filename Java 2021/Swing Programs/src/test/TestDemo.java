package test;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import animation.Animation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class TestDemo {
  public static void main(String arsg[]) {
	  JFrame frame = new JFrame();
	  frame.setVisible(true);
	  frame.setBounds(100, 100, 600, 500);
	  frame.getContentPane().setLayout(null);
	  
	  Rect rect = new Rect();
	  
	  rect.setBounds(172, 59, 162, 131);
	  
	  rect.setText("Circle");
	  
	  rect.setStrokeWidth(16);
	  rect.setStroke(Color.gray);
	  rect.setRadius(200);
	  frame.getContentPane().add(rect);
	  
	  rect.setFont(new Font("Arial", Font.BOLD, 25));
	  rect.setForeground(new Color(255, 230, 130));
	  
	  Tranform tranform = new Tranform(rect);
	  
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.BLUE);
	  panel.setBounds(85, 282, 373, 131);
	  frame.getContentPane().add(panel);
	  
	  Animation animate = new Animation(panel);
	  rect.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		animate.slideToggle(4);
	  	}
	  });
	  
	  
  }
}
