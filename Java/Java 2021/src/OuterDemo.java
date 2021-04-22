
public class OuterDemo {
    private static void outerMethod() {
    	System.out.print("Inside outer method");
    }
    // A static inner class
    static class Inner{
    	public static void main(String []args) {
    		System.out.println("inside inner class method");
    		outerMethod();
    	}
    }
}
