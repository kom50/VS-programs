import java.util.*;

// package J 2021.Collection Framework;

public class ListInitializerDemo {
    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>() {
            {
                add("HTML");
                add("CSS");
            }
        };

        System.out.println(l1);

        List<String> l3 = new ArrayList<String>(List.of("C", "C++", "Python"));
        System.out.println(l3);

        l3.add("Java");
        System.out.println("After Added some data :" + l3);
    }
}
