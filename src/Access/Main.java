package Access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
        // Need to do few things;
        // 1. access the data members.
        // 2. modify the data members.

        // ArrayList<Integer> list = new ArrayList<>();
        // list.DEFAULT_CAPACITY; // private class. not accessed.

        System.out.println(obj.getNum());

    }
}
