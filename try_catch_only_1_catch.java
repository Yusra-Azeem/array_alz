import java.io.*;

class try_catch_only_1_catch {
    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            System.out.println("Inside try block");

            int a = 10 / 0;                 // ArithmeticException
            System.out.println("After division");

            FileReader fr = new FileReader("data.txt"); // IOException
            System.out.println("File opened");

        }  catch (Exception e) {
            System.out.println("Caught  all Generic Exception");

        } finally {
            System.out.println("Inside finally block");
            
        }

        System.out.println("Program ended");
    }
}

