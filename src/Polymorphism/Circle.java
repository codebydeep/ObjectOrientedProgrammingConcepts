package Polymorphism;

public class Circle extends Shapes{

    // This will run when Object of Circle is created.
    // Hence it is Overriding the Parent method.
    @Override // This is called Annotation. Only for check purposes.
    void area(){
        System.out.println("Area is Pie * r * r");
    }
}
