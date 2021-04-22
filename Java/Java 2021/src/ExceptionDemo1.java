import static java.lang.System.*;
public class ExceptionDemo1 {
    static void validateAge(int age) {
    	if(age < 18)
    		 throw new ArithmeticException("not valid...");
    	else
    		out.println("Welcome to vote...");
    }
	public static void main(String []args) {
    	
		try {
			validateAge(4);    	
		}
		catch(Exception e) {
			out.println("Error : "+e);
		}
    	out.println("Rest of code...");
    }
}
