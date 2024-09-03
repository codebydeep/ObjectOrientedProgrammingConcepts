package Inheritance;

import java.util.ArrayList;

public class Box {
    double l;
    double h;
    double w;
//  double weight;


    // @Override
    // for static, example;
    static void greeting(){
        System.out.println("Heyy, I am in Box class. Greetings!");
        // ArrayList<Integer> list = new ArrayList<>();
        // Only for Abstraction explaination;
        // These are abstract classes, having only .add(), .get() method;
    }

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the Box");
    }
}
