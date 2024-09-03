package Access;

public class A {
    private int num;
    String name;
    int[] arr;

    // 1. public access modifier -
    // Can be access anywhere, no special method needed.
    // 2. private access modifier -
    // Can be accessed by getters & setters Method, these methods can be public.
    // 3. default access modifier -
    // Can be available in same package, but cannot be outside the package.
    // 4. protected access modifier -
    // Can be access in same class & package, but cannot in different package.
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
