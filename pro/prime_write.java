import java.io.*;
class prime_write
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter("prime.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        for(int x=1;x<=5;x++)
        {
            System.out.println("enter no "+x);
            int n=Integer.parseInt(br.readLine());
            pw.println(n);
        }
        pw.close();
        bw.close();
        fw.close();
    }
}