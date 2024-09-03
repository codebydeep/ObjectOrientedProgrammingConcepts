package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // Class is ArrayList;
        List<Integer> list2 = new LinkedList<>();

//        for (int i = 0; i < 5;i++) {
//            list2.add(i*2);
//        }
//        System.out.println(list2);

//        Vector list have a 1 operative Element at a time, other is in at waiting position;
//        While, ArrayList have faster as it has all the Elements can be performing at a Time;
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);
        System.out.println(vector);

    }
}
