
public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			int arr[] = { 10, 20, 30, 40, 50, 60 };
			int a = 5 / 0;
			arr[9] = 90;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : " + e);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("final block");
		}
	}
}
