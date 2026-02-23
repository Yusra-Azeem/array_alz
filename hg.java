import java.io.*;
class testhdsjh{
    public static void main(String args[]) throws IOException{
        FileInputStream fout=new FileInputStream("fileb.dat");
        DataInputStream dout=new DataInputStream(fout);
        int n1=dout.readInt();
        String s=dout.readUTF();
        dout.close();
    }
}