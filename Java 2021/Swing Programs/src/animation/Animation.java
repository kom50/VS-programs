package animation;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Animation {
	// Variables
	private Timer timer;
	private Component com;
	private int initHeight, initWidth;
	private boolean flag;

	public Animation(Component com) {
		this.setComponent(com);
		this.flag = true;
	}
	public Component getComponent() {	  return com;	}
	private void setComponent(Component com) {	  
		this.com = com; 
		this.initHeight = com.getHeight();
		this.initWidth = com.getWidth();
	}

	public  void slide(Component com, String direction, int speed) {

	}

	public  void slideUp(int speed) {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Timer is running...");
				if (com.getHeight() != 0) {
					com.setSize(com.getWidth(), com.getHeight() - 1);	
				}
				if (com.getHeight() == 0) {
					timer.stop();
//					System.out.println("Timer is stoped... ");
				}
			}
		};
		timer = new Timer(speed, action);
		timer.start();
	}

	public  void slideDown(int speed) {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Timer is running... "  );
				if (com.getHeight() != initHeight) {
					com.setSize(com.getWidth(), com.getHeight() + 1);	
				}
				if (com.getHeight() == initHeight) {
					timer.stop();
//					System.out.println("Timer is stoped... " );
				}
			}
		};
		timer = new Timer(speed, action);
		timer.start();
	}

	public  void slideLeft(int speed) {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Timer is running... " +com.getWidth());
				if (com.getWidth() != 0) {
					com.setSize(com.getWidth() - 1, com.getHeight());	
				}
				if (com.getWidth() == 0) {
					timer.stop();
					System.out.println("Timer is stoped... "+com.getWidth() );
				}
			}
		};
		timer = new Timer(speed, action);
		timer.start();
	}

	public  void slideRight(int speed) {
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Timer is running... " +com.getWidth());
				if (com.getWidth() != initWidth) {
					com.setSize(com.getWidth() + 1, com.getHeight());	
				}
				if (com.getWidth() == initWidth) {
					timer.stop();
					System.out.println("Timer is stoped... "+com.getWidth() );
				}
			}
		};
		timer = new Timer(speed, action);
		timer.start();
	}

	public void slideToggle(int speed) {
		if(com.getHeight() == 0)
			flag = false;
		else 
			flag = true;
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Timer is running... " );
				if (flag) {
					com.setSize(com.getWidth(), com.getHeight() - 1);
					if (com.getHeight() == 0) {
						flag = false;			
					}
				} else {
					com.setSize(com.getWidth(), com.getHeight() + 1);
					if (com.getHeight() == initHeight) {
						flag = true;				
					}
				}
				if (com.getHeight() == 0 || com.getHeight() == initHeight) {
					timer.stop();
//					System.out.println("Timer is stoped... ");
				}
			}
		};

		timer = new Timer(speed, action);
		timer.start();
	}

	
	
}  // class End
