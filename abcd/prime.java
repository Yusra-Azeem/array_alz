import java.util.Scanner;
class prime
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);

        System.out.println ("Enter number");
        int n=sc.nextInt();
        int c=0;
        for (int x=2;x<=n-1;x++)
        {
            if (n%x==0)
            {
                c=1;
            }
        }
        if (c==1)
        {
            System.out.println ("it not prime nuber");
        }
        else
        {
            System.out.println ("it prime number");
        }
    }
}

