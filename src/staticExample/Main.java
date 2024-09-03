package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal Kushwaha" , 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human arpit = new Human(28,"Arpit", 18000, true);
//        System.out.println(kunal.population);
//        System.out.println(rahul.population);
//        Don't Do it , it works but it was not as Convention.

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();

        Main funn = new Main();
        funn.fun2();

// Static:
// When a member is declared static , it can be accessed before any of the object of the Class is being crested & without referencing to that object.

      // greeting(); --> It does not have an access to non static method.



    }
    // this is not dependent on objects.
   static void fun(){
//        greeting(); --> // You can't use this because it requires an instance
//        but the function you are using it in does not depend on instances.


       // You cannot access non-static stuff without referencing their instances in
       // a static context.

       // hence, here I am referencing it.
       Main obj = new Main();
       obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // We know that something which is not static, belongs to an object.
    void greeting(){
//        fun(); // We can have a static method inside non-static, this can be possible.
        System.out.println("Hello! World");
    }
    // Object is needed for this non-static method, for access.
}
