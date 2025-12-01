import java.util.Scanner;
class SeriesODD //1/1+1/3+1/5......
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        double sum=0;
        for(int x=1;x<=n;x+=2)
        {
            sum=sum+1.0/x;
        }
        System.out.println("The sum is: "+sum);
    }
}