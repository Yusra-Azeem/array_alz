import java.io.*;

public class ReadBinaryBuffered {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("data.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            while (true) {
                int num = dis.readInt();   // Reads integer
                System.out.println("Read: " + num);
            }

        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/**🔎 How EOF Works Here

readInt() keeps reading data

When file ends → EOFException is thrown

We catch it and print: "End of file reached"

🧠 Important Concept

For text files, we check:

while ((line = br.readLine()) != null)

But for binary files, we use:

try {
   while(true) {
       read...
   }
} catch (EOFException e) {
   // file ended
}*/