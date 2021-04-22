import java.lang.reflect.Method;

import java.lang.reflect.Field;

public class ArrayDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        int arr[] = new int[] { 12, 13, 14, 15, 16, 17, 18 };
        System.out.println(arr.toString());
        System.out.println(arr.getClass().getSimpleName());
        Class c1 = arr.getClass();
        boolean b = c1.isArray();
        System.out.println(b);
        ArrayDemo ar = new ArrayDemo();
        System.out.println(ar.getClass().getSimpleName());
        System.out.println("-> " + ar.getClass().isPrimitive());

        // int
        int a = 20;
        System.out.println(a);

        // Object ob =
        Class c2 = Class.forName("java.lang.String");
        System.out.println(c2.getMethods().length);

        // for (Method m : c2.getMethods())
        // System.out.println(m);

        System.out.println();
        for (Field f : c2.getFields())
            System.out.println(f);
        System.out.println(c1.getSuperclass());

        // copy arrray
        int copyArr[] = arr.clone();
        System.out.println(arr + " " + copyArr);
        for (int i : copyArr) {
            System.out.printf("%4d", i);
            // System.out.flush();
        }
        System.out.println("\n Check : " + copyArr.equals(arr));

        int[] m[] = { { 1, 2 }, { 3, 4 } };
        System.out.println(m);
        int[] n[] = m.clone();
        System.out.println(n);
        System.out.println("\n " + m.equals(n));

        System.out.println(m[0][0] == n[0][0]);

        System.out.println(m.getClass());

        Class c4 = Class.forName("Test");
        System.out.println(c4);

        //
        Test t1 = new Test();

        System.out.println(t1);

        for (Method m1 : c4.getMethods()) {
            System.out.println(m1);
        }

        System.out.println("\n");
        for (Field each : c4.getFields()) {
            System.out.println(each);
        }

        System.out.println(c4.getPackageName().length());
        System.out.println(c4.isSynthetic());

        // System.out.println(c4.);
    }

}

class Test {
    static int a = 2;
    int f = 23;
    public static float x = 3.3F;

    public int getA() {
        return a;
    };

    double y = 32.2;

    public void show() {
        System.out.println("Hello world!");
    }
}