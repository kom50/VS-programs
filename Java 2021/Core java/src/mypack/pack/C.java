package mypack.pack;

public class C {
	public void showC() {
		System.out.println("C class method");
	}
	void deshow() {
		System.out.println("Default c");
	}
	protected void prshow() {
		System.out.println("protected c");
	}	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.disp();
		
		Demo.st();
		String [] str = {};
		Demo.main(str);
	}
}
