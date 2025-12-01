import java.io.*;
class um_r
{
    public static void mian(String args[])throws IOException
    {
        FileInputStream fin= new FileInputStream("marks.dat");
        DataInputStream din=new DataInputStream(fin);
        boolean eof=false;
        while(!eof)
        {
            try
            {
                int n=din.readInt();
                System.out.println(n);
            }
            catch(EOFException e)
            {
                eof=true;
            }
        }
        din.close();
        fin.close();
    }
}
 