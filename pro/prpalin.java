import java.util.Scanner;
class prpalin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bn");
        int b=sc.nextInt();
        System.out.println("Enter sn");
        int s=sc.nextInt();
        for(int x=s+1;x<b;x++)
        {
            if(prime(x)&&palin(x))
            {
                System.out.println(x);
            }
        }
    }

    public static boolean palin(int n)
    {
        int r=0;
        int x=n;
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(r==x)
        {
           return true;
        }
        else
        {
            return false;
        }
    }
    

    public static boolean prime(int n)
    {
        for(int x=2;x<n;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
}