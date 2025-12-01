import java.util.Scanner;
class SeriesMinusPlus //1/1-1/2+1/3-1/4+1/5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        double sum=0.0;
        for(int x=1,y=1;x<=n;x=+2)
        {
            if(y%2!=0)
            {
                sum=sum+1.0/x;
            }
            else
            {
                sum=sum-1.0/x;
            }
        }
        System.out.println("The sum is: "+sum);
    }
}