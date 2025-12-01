import java.util.Scanner;
class Func_Add
{
    public static int add(int n, int m)
    {
        int sum=m+n;
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int sum=add(n,n1);
        System.out.println("Sum is: "+sum);
    }
}