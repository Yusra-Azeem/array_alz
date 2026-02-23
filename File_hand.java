import java.io.*;
class File_hand{
    public static void main(String args[])throws IOException
    {
     FileWriter fw=new FileWriter("File1.txt",true);   
     BufferedWriter bw=new BufferedWriter(fw);
     PrintWriter pw=new PrintWriter(bw);
     pw.println("HEY racist2");
     pw.println("meow2");
     pw.println("im girl2");
    
     pw.close();
     bw.close();
     fw.close();
    }
}