import java.util.Scanner;

public class Demo1 {
	public static void main(String []args) {
		Scanner sc = new Scanner("123 A 3b c,45,x5x,76 82 L");
		sc.useDelimiter(" ");
//		while(sc.hasNextInt())
		   System.out.print(sc.nextInt()+" ");
	}
}
