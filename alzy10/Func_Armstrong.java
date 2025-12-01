import java.util.Scanner;
class Func_Armstrong
{
    public static boolean armstrong(int num)
    {
        int cube=0;
        int t=num;
        while(num!=0)
        {
            int d=num%10;
            cube=cube+d*d*d;
            num=num/10;
        }
        if(cube==t)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        boolean b=armstrong(n);
        System.out.println(b);
    }
}