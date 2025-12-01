import java.io.*;
class Marks
{
    public static void main(String args[])throws IOException
    {
        int rno;float marks;
        FileOutputStream fout=new FileOutputStream("Toppers.dat");
        DataOutputStream dout=new DataOutputStream(fout);
        FileInputStream fin=new FileInputStream("Stu.dat");
        DataInputStream din=new DataInputStream(fin);
        boolean eof=false;
        while(!eof)
        {
            try
            {
                rno=din.readInt();
                marks=din.readFloat();
                if(marks>75)
                {
                    dout.writeInt(rno);
                    dout.writeFloat(marks);
                    System.out.println(rno +" is topper with marks "+marks);
                }
            }
            catch(EOFException e)
            {
                System.out.println("End of file ");
                eof=true;
            }
        }
        dout.close();
        fout.close();
        System.out.println("\nTopper file succesfully created");
    }
}