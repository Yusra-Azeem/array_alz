import java.util.Scanner;
class primeNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n =sc.nextInt();
        boolean p=true;
        for(int x=2;x<n;x++)
        {
            if(n%x==0)
            {
                p=false;
                break;
            }
        }
        if(p==true)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not Prime number");
        }
    }
}