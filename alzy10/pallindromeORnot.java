import java.util.Scanner;
class pallindromeORnot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int rev=0;
        int t=n;
        while(t!=0)
        {
            int d=t%10;
            rev=10*rev+d;
            t=t/10;
        }
        if(rev==n)
        {
            System.out.println("Entered number is pallindrome");
        }
        else
        {
            System.out.println("Entered number is not pallindrome");
        }
    }
}
        