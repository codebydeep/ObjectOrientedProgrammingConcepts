import java.util.Arrays;
public class IntroductionOOPs {
    public static void main(String[] args) {
        // Suppose store 5 roll nos;
        int[] numbers = new int[5];
        // Stores 5 names;
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring;
        // Student kunal;
        // kunal = new Student();

        Student kunal = new Student();

        kunal.rno = 13;
        kunal.name = "Kunal Kushwaha";
        //kunal.marks = 88.5f;
        System.out.println(kunal); // gives random value
        System.out.println(kunal.rno); // gives by-default 0
        System.out.println(kunal.name); // gives by-default null
        System.out.println(kunal.marks); // gives by-default 0
    }
}
     // Creating a class;
     // For every single student
     class Student{
        int rno;
        String name;
        float marks = 90;
     }
