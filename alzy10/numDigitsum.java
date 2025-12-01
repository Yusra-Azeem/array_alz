import java.util.Scanner;
class numDigitsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0)
        {
            int t=n%10;
            sum=sum+t;
            n=n/10;
        }
        System.out.println("Entered number sum is: "+sum);
    }
}