import java.io.*;

public class WriteBinaryBuffered {

    public static void main(String[] args) {

        try {
            // Buffered input from keyboard
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Binary file output with buffering
            FileOutputStream fos = new FileOutputStream("data.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            System.out.print("Enter number of integers: ");
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = Integer.parseInt(br.readLine());

                dos.writeInt(num);   // Writing in binary format
            }

            dos.close();  // closes all streams
            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}