package mypack.pack;

import mypack.A;
import mypack.Testa;

public class Demo {
	
	void disp() {
		System.out.println("Default ");
	}
	static void st() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		A a  = new A();
		a.show();
		
		Testa t1 = new Testa();
		t1.testM1();
		
	}
}
