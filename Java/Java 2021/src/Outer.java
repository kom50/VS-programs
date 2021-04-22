
public class Outer {
    private static void outerMethod() {
        System.out.print("Inside outer method");
    }

    static void show(String name, int age) {
        System.out.println(name + "  " + age);
    }

    // A static inner class
    static class Inner {
        public static void main(String[] args) {
            System.out.println("inside inner class method");
            outerMethod();
            show("Hello", 20);
        }
    }
}
