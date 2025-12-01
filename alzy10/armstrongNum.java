import java.util.Scanner;
class armstrongNum //153 cube the digits n add em u get the 153 again
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int cube=0;
        int t=n;
        while(t!=0)
        {
            int d=t%10;
            cube=cube+d*d*d;
            t=t/10;
        }
        if(cube==n)
        {
            System.out.println("Entered number is armstrong ");
        }
        else 
        { 
            System.out.println("Entered number is not armstrong ");
        }
    }

}