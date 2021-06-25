// Use of throw keyword
public class ExceptionDemo2 {
	static void checkAge(int age) {
		// Use of throw key keyword
		if (age < 18) {
			throw new ArithmeticException("Not valid");
		} else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(14);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("REst of code");
	}
}
