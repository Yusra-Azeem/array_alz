import java.util.Scanner;
class numberSqALLdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        int sq=1;
        while(n!=0)
        {
            int d=n%10;
            sq=d*d;
            n=n/10;
            System.out.println("Entered number square is: "+sq);
        }
    }
}