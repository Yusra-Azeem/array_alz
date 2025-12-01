import java.io.*;
class prime_read
{
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader("prime.txt");
        BufferedReader fbr=new BufferedReader(fr);
        String s;
        while((s=fbr.readLine())!=null)
        {
            boolean prime=true;
            int n=Integer.parseInt(s);
            for(int x=2;x<=n/2;x++)
            {
                if(n%x==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime==true&&n!=1)
            {
                System.out.println(n);
            }
        }
    }
}