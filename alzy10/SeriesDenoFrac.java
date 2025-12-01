import java.util.Scanner;
class SeriesDenoFrac //1/1+1/2+1/3...
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n =sc.nextInt();
        double sum=0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+x;
        }
        System.out.println("The series sum is: "+sum);
    }
}