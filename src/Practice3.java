import java.util.Arrays;
public class Practice3 {
    public static void main(String[] args) {
        // stores 5 roll no;
        int[] numbers = new int[5];

        // stores 5 names
        String[] names = new String[5];

        // store data of 5 Students : {rollno, name, marks};
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

        Stud[] student = new Stud[5];


        Stud kunal = new Stud(); // kunal is object or reference variable.
        // Or also Initializes it.
        // kunal = new Stud();
        //kunal.name = "Ocean";

        Stud rahul = new Stud("Harry" , 13, 65.65f);


        System.out.println(kunal.name);
        System.out.println(kunal.rno);
        System.out.println(kunal.marks);

        System.out.println(rahul.name);
        System.out.println(rahul.rno);
        System.out.println(rahul.marks);
        kunal.greeting();
        rahul.greeting();

        kunal.changeName("Mastermind");
        // Now, method greeting will change name;
        kunal.greeting();
        rahul.greeting();
    }
}

// A class starts with a Capital letter.
// create a class.
class Stud{
        int rno;
        String name;
        float marks;


    // Constructor runs when you creates an object and it allocates some variables.
    // By-default Constructor. // Special function that creates object.
    Stud(){
        this.name = "KK";
        this.rno = 12;
        this.marks = 78.65f;
    }
    Stud(String name, int rno, float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("Hello! My name is "+ this.name);
    }

    void changeName(String newName){
        name = newName;
    }
}
