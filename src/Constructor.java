public class Constructor {
    public static void main(String[] args) {
        // Suppose store 5 roll nos;
        int[] numbers = new int[5];
        // Stores 5 names;
        String[] name = new String[5];
        float[] marks = new float[5];

        //Student[] students = new Student[5];

        // just declaring;
        // Student kunal;
        // kunal = new Student();

        Students kunal = new Students(15, "Deep", 92.45f);

        //kunal.rno = 13;
        //kunal.name = "Kunal Kushwaha";
        //kunal.marks = 88.5f;

        System.out.println(kunal); // gives random value
        System.out.println(kunal.rno); // gives by-default 0
        System.out.println(kunal.name); // gives by-default null
        System.out.println(kunal.marks); // gives by-default 0

        /*
        kunal.changeName("Shoe Lover");
        kunal.greeting();
         */

        Students random = new Students(kunal);
        System.out.println(random.name);

//        Students random2 = new Students();
//        System.out.println(random2.name);


        Students one = new Students();
        Students two = one;
        one.name = "Something Something";
        System.out.println(two.name);
    }
}
// Creating a class;
// For every single student
    class Students {
    int rno;
    String name;
    float marks = 90;

    // We need a way to add the values of the above properties object by object.
    // We need one word to access every object.

    // Initialising a Constructor, same name as class name.
    // Default Constructor //
    Students() {
        this.rno = 13;
        this.name = "Kunal Kushwaha";
        this.marks = 88.5f;
    }

    // Function
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    Students(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Constructor that takes value from another Constructor.
    Students(Students other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Students arpit = new Student(17, "Arpit", 89.7f);
    // Here this will be replaced with Arpit.
//    Students (int rno , String name , float marks){
//        this.rno = rno;
//        this.name = name;
//        this.marks = marks;
//    }
//    Students(){
//        // This is how you call a constructor from another constructor.
//        // Internally, new Student();
//        this (13, "default person" , 100.00f);
//    }

}