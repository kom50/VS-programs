
public class ThreadDemo {
    public static void main(String []args) throws InterruptedException {
    	Thread t1 = new Thread(new Runnable() {
    		public void run() {
    			for(int i = 0; i < 5; i++)
    				System.out.println("Thread 1 run... "+i);
    		}
    	});
    	Thread t2 = new Thread(new Runnable() {
    		public void run() {
    			for(int i = 0; i < 5; i++) {
    				System.out.println("Thread 2 run... "+i);
    			try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			}
    		}
    	});
    	
//    	t1.start();
//		 t2.start(); 
    	for(int i = 0; i < 10; i++) {
    		try {
    			Thread.sleep(1000);
    			System.out.println(Thread.currentThread());
    			System.out.println("Value of i "+i);
    		}catch(Exception e) {
    			
    		}
    	}
    	
    }
    public static void ok() {
		
	}
}
