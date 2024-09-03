public class Practise {
    public static void main(String[] args) {
        Human Deep = new Human(13, "Kunal");
        /*
         Deep.name = "Homosephians";
         Deep.sNo = 1;
         */
        System.out.println(Deep.name);
        System.out.println(Deep.sNo);

        Human Rahul = new Human();
        System.out.println(Rahul.name);
        System.out.println(Rahul.sNo);

        Deep.changeName("Harry");
        Deep.greet();
        Rahul.greet();
    }
}
class Human{
    String name ;
    int sNo;
    Human(){
        this.name = "Pomosephians";
        this.sNo = 2;
    }
    void greet(){
        System.out.println(this.name);
    }
    void changeName(String newName){
        name = "newName";
    }
    Human(int rno, String name){
        this.sNo = rno;
        this.name = name;
    }
}
