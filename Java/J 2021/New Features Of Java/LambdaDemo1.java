import java.util.*;

// package J 2021.New Features Of Java;

public class LambdaDemo1 {

    private interface Sayable<T> {
        public T say();
    }

    public static void main(String[] args) {

        Sayable<String> s1 = new Sayable<String>() {
            public String say() {
                return "Sayable Interface";
            }
        };

        Timer t1 = new Timer();
        // t1.schedule(new TimerTask() {
        // int i = 0;

        // public void run() {

        // System.out.println("Hello Bro " + (i++));
        // try {
        // this.wait(1000);
        // } catch (Exception e) {
        // }
        // // t1.cancel();
        // }
        // }, 1000, 1000);

        // Using lambda expression
        Sayable<String> s2 = () -> "Hello";
        // Sayable<Integer> s3 = { System.out.print("Helo"); };
        System.out.println(s1.say() + "  " + s2.say());

        // int a = #{->34};
        List<Integer> l1 = new ArrayList<>();

        l1.add(40);
        l1.add(20);
        l1.add(30);
        l1.add(10);

        Iterator<Integer> itr = l1.iterator();
        int sum = 0;
        l1.forEach(e -> System.out.println(e));

        while (itr.hasNext()) {
            sum += itr.next();
        }
        System.out.println("sum of list item = " + sum);

    }
}
