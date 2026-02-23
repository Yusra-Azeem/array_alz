import java.io.*;

class FileWriteBlueJ {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("test.txt",true); // created in project folder
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println("Hello BlueJ");
        pw.println("File writing works!");
        pw.println("This is saved in project folder.");

        pw.close(); // enough
    }
}
