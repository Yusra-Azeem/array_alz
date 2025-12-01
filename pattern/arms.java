import java.util.Scanner;
class arms
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter smaller no");
        int s=sc.nextInt();
        System.out.println("Enter bigger no");
        int b=sc.nextInt();
        for(int x=s;x<=b;x++)
        {
            int sum=0;
            for(int y=x;y!=0;y=y/10)
            {
                int p=y%10;
                int d=p*p*p;
                sum+=d;
            }
            if(sum==x)
            {
                System.out.println(x);
            }
        }
    }
}
        