//package 2021. Collection Framework;

import java.util.*;

public class ListDemo1 {
    public interface Sayable<T> {
        public T say();
    }

    public static void main(String[] args) {

        Sayable<String> s1 = new Sayable<String>() {
            public String say() {
                return "Sayable Interface";
            }
        };

        System.out.println(s1.say());

        List<String> l1 = new ArrayList<>();
        l1.add("OM");
        l1.add("kumar");
        l1.add(1, "Ok");

        // Using Iterator Interface
        Iterator<String> itr = l1.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // Using forEach() method
        l1.forEach(a -> {
            System.out.println("Item : " + a);
        });

        List<String> l2 = List.of("Vikash", "Raja", "Rahul", "Prakash", "Pravin", "Rakesh", "Prabhat");

        System.out.println(l2.size());
        System.out.println(l2.subList(1, 4));
        // l2.addAll(l3);
        System.out.println(l2);

    }

}
