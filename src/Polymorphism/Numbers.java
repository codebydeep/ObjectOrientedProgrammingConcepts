package Polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a + b;
    }

    // What if --> Possible;
    double sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){ // Orders must be same; Not like this int sum(int b, int c, int a){....};
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(1,3,7);

//      obj.sum(4,5,6,8);
    }

}
