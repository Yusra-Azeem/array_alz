import java.util.Scanner;
class Sum_array
{
    public static void main (String args [])
    {
        Scanner sc=new Scanner (System.in);
        int ar[]=new int [5];
        for (int x=0;x<=4;x++)
        {
            System.out.println("Enter number");
            ar[x]=sc.nextInt();
        }
        int sum=0;

        for (int x=0;x<=4;x++)
        {
            sum=sum+ar[x];

        }
        System.out.println("Sum is "+sum);
        int big=ar[0];
        for (int x=1;x<=4;x++)
        {
            if (ar[x]>big)
            {
                big=ar[x];
            }
        }
        System.out.println ("biggest number "+big);
        System.out.println ("even number");
        for (int x=0;x<=4;x++)
        {
            if (ar[x]%2==0)
            {
                System.out.println (ar[x]);
            }
        }

    }
}
