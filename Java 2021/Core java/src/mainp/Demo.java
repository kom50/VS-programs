package mainp;
import mypack.A;
import mypack.pack.C;

public class Demo extends C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.show();
		
		
		C c = new C();
		c.showC();
	
		Demo d = new Demo();
		d.prshow();
		d.showC();

	}

}
