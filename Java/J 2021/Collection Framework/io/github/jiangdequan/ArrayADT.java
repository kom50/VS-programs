package io.github.jiangdequan;

// import javax.lang.model.type.ArrayType;
import static java.lang.System.*;
// import jdk.nashorn.internal.objects.SetIterator;

public class ArrayADT {
    private int arr[];
    private int size = 0, capacity = 10;

    ArrayADT() {
        arr = new int[capacity];
    }

    ArrayADT(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void add(int data) {
        arr[size++] = data;
    }

    int get(int index) {
        if (index > size) {
            System.out.println("Array Index out of bounds !!!");
            return -1;
        }
        return arr[index];

    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("[");
        for (int i = 0; i < size - 1; i++) {
            str.append(arr[i] + ", ");
        }
        str.append(arr[size - 1] + "]");
        String s = new String(str);
        return s;
    }

    public static void main(String[] args) {
        ArrayADT a1 = new ArrayADT();

        a1.add(10); // i = 1
        a1.add(20); // i = 2
        a1.add(30); // i = 3
        out.println(a1);
        for (int i = 0; i < a1.size; i++)
            out.printf("%4d", a1.get(i));
    }
}