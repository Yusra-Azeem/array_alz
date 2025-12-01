import java.util.Scanner;
class Factorial
{
    int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    int reverse(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        Factorial ob=new Factorial();//REVERSE
        int f=ob.fact(n);
        System.out.println("Factorial is: "+f);
        int r=ob.reverse(n);
        System.out.println("Reverse is: "+r);
    }
}