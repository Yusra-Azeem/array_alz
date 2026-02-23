import java.io.*;
class testhdsjh{
    public static void main(String args[]) throws IOException{
        FileOutputStream fout=new FileOutputStream("fileb.dat");
        DataOutputStream dout=new DataOutputStream(fout);
        dout.writeInt(10);
        dout.writeUTF("hello");
        dout.close();
    }
}