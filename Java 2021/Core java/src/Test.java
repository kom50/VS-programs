import mypack.*;
import mypack.pack.C;
public class Test extends Testa{
	
	public static void main(String[] args) {
		A a = new A();
		a.show();
		B b = new B();
		b.show();
		
		Test t = new Test();
		t.testM();
		
		Testa t1 = new Testa();
		t1.testM1();
		
		//mypack.pack class C
		C c = new C();
		c.showC();
		
		
		
	}
}
