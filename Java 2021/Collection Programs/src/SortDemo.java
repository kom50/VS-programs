import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("C", " C++");

		/*
		 * for (int i = 0; i < l1.size(); i++) { System.out.print(l1.get(i) + "  "); }
		 */
		int arr[] = {10, 20, 23, 5, 24, 12};
		// Copy ,e
		int arrCopy[] = Arrays.copyOf(arr, arr.length);
		for(int x : arr)
			System.out.printf("%4d",x);
		
		int s = Arrays.binarySearch(arr, 12);
		System.out.println("\nIndex "+s);
		
		ArrayList<String> ll = new ArrayList<>();
	    ll.add("22");
	    System.out.println(ll);
	    Object l2 = ll.clone();
	    if (l2 instanceof ArrayList) {
	    	System.out.println("YES");
		}
	}
}
