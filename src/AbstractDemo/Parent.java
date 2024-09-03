package AbstractDemo;

public  abstract class Parent {
    int age;

    // Also Possoble;
    // static int age;
    // final int VALUE;
    public Parent(int age){
        this.age = age;
    }

    // If we make Abstract Constructors, can it possible. No;
//
    abstract void career();
    abstract void partner();
    void normal(){
        System.out.println("Hello! World");
    }
}
