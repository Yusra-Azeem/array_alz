import java.util.Scanner;
class SeriesSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int sum=0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+x;
        }
        System.out.println("The sum is: "+sum);
    }
}