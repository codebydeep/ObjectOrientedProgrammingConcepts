package ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(34, "Kunal Kushwaha");
        // Human twin = new Human(kunal);

        // Cloning kunal Object here;
        Human twin = (Human)kunal.clone();
        System.out.println(twin.age + " " + twin.name);

        // Shalow & Deep Copying part;
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));
    }
}
