public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        Integer num = 45;

        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        final int bonus = 2;
        // bonus = 3; Can't modified final variable;

        A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name"; // It is possible;

        // When a non-primitive is final, you cannot reassign it;
        kunal = new A("new object");
    }
   static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
    // It will not swap as we declare variables as a Integer class, because it is a final class;
    //   see below;
}
// Final Keyword;
// int INCREASE = 2; --> Convention.

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
    // final variable must have be intialized, while declaring it;
    // We cannot make change the value when it is primitive DataType, but we can change the value as it was not primitive;
}