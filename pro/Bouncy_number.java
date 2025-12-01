import java.util.Scanner;
class Bouncy_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();

        if(num>0 && increasing(num)==false && decreasing(num)==false)
        {
            System.out.println(num+"is bouncy");           
        }

        else
        {
            System.out.println(num+" is not bouncy");
            if(increasing(num))
            {
                System.out.println("it is increasing number");
            }
            if(decreasing(num))
            {
                System.out.println("it is decreasing number");
            }
        }
    }

    public static boolean increasing(int n)
    {
        String s=String.valueOf(n);
        int ar[]=new int[s.length()];
        for(int x=ar.length-1;x>=0;x--)
        {
            int d=n%10;
            ar[x]=d;
            n=n/10;
        }
        for(int x=0;x<ar.length-2;x++)
        {
            if(ar[x+1]<ar[x])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean decreasing(int n)
    {
        String s=String.valueOf(n);
        int ar[]=new int[s.length()];
        for(int x=ar.length-1;x>=0;x--)
        {
            int d=n%10;
            ar[x]=d;
            n=n/10;
        }
        for(int x=0;x<ar.length-2;x++)
        {
            if(ar[x+1]>ar[x])
            {
                return false;
            }
        }
        return true;
    }
}