import java.util.Scanner;
class seriesNum
{
    public static void main(String args[])//x/1+x/2...nhi ata :( TT
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        double sum=0;
        for(int y=1;y<=n;y++)
        {
            sum=sum+(double)(x/y);
        }
        System.out.println("The sum is: "+sum);
    }
}