package Questions;

public class Ques1 {
    public static void main(String[] args) {
        Person Deep = new Person();
        Person Deep2 = new Person("Akash" , 19);
        System.out.println(Deep.name);
        System.out.println(Deep.age);

        System.out.println(Deep2.name);
        System.out.println(Deep2.age);
    }
}
class Person{
    String name;
    int age;
    // Constructor
    Person(){
        this.name = "Deepansh";
        this.age = 22;
    }

    Person(String naam, int aayu){
        name = naam;
        age = aayu;
    }
}
