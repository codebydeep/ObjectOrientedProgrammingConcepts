package EnumExamples;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is week

        // Constructor
        Week() {
            System.out.println("Constructor called for " + this.toString());
        }
        // this is not public or protected, only private or default
        // Why? we don't want to create new objects
        // this is not the enum concept, that's why.

        // Internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for (Week day : Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}
