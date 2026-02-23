import java.io.*;

class try_catch {
    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            System.out.println("Inside try block");

            int a = 10 / 0;                 // ArithmeticException
            System.out.println("After division");

            FileReader fr = new FileReader("data.txt"); // IOException
            System.out.println("File opened");

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            System.out.println("Reason: " + e);

        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
            System.out.println("File does not exist");

        } catch (IOException e) {
            System.out.println("Caught IOException");

        } catch (Exception e) {
            System.out.println("Caught  all Generic Exception");

        } finally {
            System.out.println("Inside finally block");
            
        }

        System.out.println("Program ended");
    }
}

// FileIOException catch is not running because an earlier exception already occurred.

// Once an exception happens:

// Java immediately leaves the try block

// Skips the remaining code

// Jumps to the first matching catch
// try {
//     System.out.println("Inside try");

//     int a = 10 / 0;                 // ❌ ArithmeticException

//     FileReader fr = new FileReader("data.txt"); // ❌ NEVER EXECUTES
// }
// catch (ArithmeticException e) {
//     System.out.println("Arithmetic Exception caught");
// }
// catch (FileNotFoundException e) {
//     System.out.println("File Exception caught");
// }

// ## 1️⃣ NullPointerException

// ### When it occurs

// 👉 When you try to use an object that is **null**.

// ### Example

// ```java
// String s = null;
// System.out.println(s.length());  // ❌
// ```

// ### Explanation

// * `s` does not point to any object
// * Calling `length()` on `null` causes exception

// ### Output

// ```
// NullPointerException
// ```

// 🧠 **Memory line:** *Using nothing as something*

// ---

// ## 2️⃣ ArrayIndexOutOfBoundsException

// ### When it occurs

// 👉 When you access an **invalid array index**.

// ### Example

// ```java
// int[] arr = {10, 20, 30};
// System.out.println(arr[3]);   // ❌
// ```

// ### Explanation

// * Valid indexes: `0, 1, 2`
// * Index `3` does not exist

// ### Output

// ```
// ArrayIndexOutOfBoundsException
// ```

// 🧠 **Memory line:** *Index outside array size*

// ---

// ## 3️⃣ NumberFormatException

// ### When it occurs

// 👉 When converting a **non-numeric String to number**.

// ### Example

// ```java
// String s = "12a";
// int num = Integer.parseInt(s);   // ❌
// ```

// ### Explanation

// * `"12a"` is not a valid number
// * Parsing fails

// ### Output

// ```
// NumberFormatException
// ```

// 🧠 **Memory line:** *Bad number format*

// ---

// ## 4️⃣ EOFException (End Of File)

// ### When it occurs

// 👉 When reading **beyond available data** in a file or stream
// (usually with `DataInputStream` or `ObjectInputStream`).

// ### Example

// ```java
// import java.io.*;

// class Test {
//     public static void main(String[] args) throws Exception {

//         DataInputStream dis =
//             new DataInputStream(new FileInputStream("data.bin"));

//         while (true) {
//             int x = dis.readInt();   // ❌ after data ends
//             System.out.println(x);
//         }
//     }
// }
// ```

// ### Explanation

// * File ends
// * Program still tries to read
// * JVM throws `EOFException`

// ### Output

// ```
// EOFException
// ```

// 🧠 **Memory line:** *Trying to read after file ends*

// ---

// ## Summary Table (Exam Friendly)

// | Exception                      | Reason                   |
// | ------------------------------ | ------------------------ |
// | NullPointerException           | Using null object        |
// | ArrayIndexOutOfBoundsException | Invalid array index      |
// | NumberFormatException          | Invalid number string    |
// | EOFException                   | Reading past end of file |

// ---