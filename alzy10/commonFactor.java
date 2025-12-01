import java.util.Scanner;
class commonFactor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        int min=n1<n2?n1:n2;
        for(int x=1;x<=min;x++)
        {
            if(n1%x==0 && n2%x==0)
            {
                System.out.println("factors are: "+x);
            }
        }
    }
}