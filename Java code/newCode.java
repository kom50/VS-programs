import java.util.ArrayList;
// import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class newCode {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("JavaScript");
        l1.add("HTML");
        l1.add("C++");
        System.out.println(l1);
        System.out.println("Hello");

        String lang[] = l1.toArray(new String[l1.size()]);
        for (String language : lang) {
            System.out.print("  " + language);
        }

        Object l2 = l1.clone();
        System.out.println("\n  l2 " + l2);

        if (l2 instanceof ArrayList)
            System.out.println("Yes, " + l2);
        else
            System.out.println("No");
        // sort in Ascending order
        l1.sort(null);
        System.out.println();
        System.out.println(l1);

        List<Integer> l3 = Arrays.asList(12, 34, 10, 42, 31);
        // l3.add("CSS");
        System.out.println(l3);

        // Sorting in Descending order

        l3.sort(Collections.reverseOrder());
        System.out.println(l3);

    }
}
