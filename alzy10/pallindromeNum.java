import java.util.Scanner;
class pallindromeNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            rev=10*rev+d;
        }
        System.out.println("Reverse of the entered digit is: "+rev);
    }
}