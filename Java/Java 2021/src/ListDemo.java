import java.util.*;

// package J 2021.Collection Framework;

public class ListDemo {
    public static void main(String[] args) throws Exception {

        List<String> l1 = new ArrayList<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add("Hello");
                add("Bro");
            }
        };
        System.out.println(l1);

        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(45, 74, 87, 85));
        System.out.println(l2);

        // create mutable
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("C", "JAVA", "C++"));

        System.out.println(l3);

        // Create immutable list
        List<String> l4 = Arrays.asList("HTML", "CSS", "JavaScript");

        System.out.println(l4);
        // l4.add(1, "jQuery"); //
    }
}
