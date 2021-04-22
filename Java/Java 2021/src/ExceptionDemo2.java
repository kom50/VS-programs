import static java.lang.System.*;
public class ExceptionDemo2 {
	int m1;
	void m() {
//		m1 = 5 /0;
//	   throw new java.io.IOException("Error.."); // Error
	}
	void n() {
		m();
	}
	
	void p() {
		try{
			n();
		}
		catch(Exception e) {
			out.println("Error : "+e);
		}
		
	}
	public static void main(String args[]) {
		ExceptionDemo2 n1 = new ExceptionDemo2();
	    n1.p();
		out.println("Rest of code...");
	}
}
