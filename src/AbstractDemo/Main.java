package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.normal();
        //Daughter daughter = new Daughter(40);
        //daughter.career();

//        Parent obj = new Parent() {
//            @Override
//            void career() {
//
//            }                // Object of n Abstract class cannot be made.
//                             // It gives Error of Overridden.
//
//            @Override
//            void partner() {
//
//            }
//        }
        // Like this, Parent class will be used as a reference variable.
        Parent daughter = new Daughter(28);
        daughter.career();
    }
}
