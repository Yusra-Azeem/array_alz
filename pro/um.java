import java.util.Scanner;
import java.io.*;
class um
{
    public static void mian(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fout= new FileOutputStream("marks.dat");
        DataOutputStream dout=new DataOutputStream(fout);
        char ch;
        do
        {
            System.out.println("Enter any number ");
            int n=sc.nextInt();
            dout.writeInt(n);
            System.out.println("more input y/n ");
            ch=sc.next().charAt(0);
        }while(ch=='Y'||ch=='y');
        dout.close();
        fout.close();
    }
}