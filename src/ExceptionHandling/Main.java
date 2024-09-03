package ExceptionHandling;

import Access.A;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
           //divide(a,b);
            String name = "Kunal";
            if (name.equals("Kunal")){
                throw new MyException("name is Kunal");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please do not divide by Zero");
        }
        return a/b;
    }
}
