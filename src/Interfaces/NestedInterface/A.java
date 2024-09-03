package Interfaces.NestedInterface;

public class A {
    // nested interface ;
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}
class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(6));
    }
}
