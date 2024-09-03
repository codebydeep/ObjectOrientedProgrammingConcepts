package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6, 7.9,9.9);
//        //Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h +" "+ box3.weight);

//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);

        //BoxPrice box = new BoxPrice(5,8,200);

//        box1.greeting();
        Box.greeting(); // In static, also by Class name rather than reference variable;

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting();  // You can Inherit, but you cannot Override.
    }
}
