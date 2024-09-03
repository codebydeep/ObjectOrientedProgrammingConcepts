package Access;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num){
        this.num = num;
    }
    // We will go in the details of How to create it in Hashmap lecture.
    @Override
    public int hashCode(){
        return super.hashCode();
        // If, return num; Gives num;
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    // Already Covered.
    @Override
    public String toString(){
        return super.toString();
    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(45);

        if (obj1 == obj2){
            System.out.println("obj is less than obj2");
        }
        // Like the Strings.
        if (obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());

//        System.out.println(obj1.hashCode()); // Give any random value.
//        System.out.println(obj2.hashCode());

        // Check for Instances, InstanceOf Method;
        System.out.println(obj1 instanceof ObjectDemo);
    }
}
