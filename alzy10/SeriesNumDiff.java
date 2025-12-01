import java.util.Scanner;
class SeriesNumDiff //1/2+2/3...
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        for(int x=1;x<=9;x++)
        {
            sum=sum+(double)x/(1+x);
        }
        System.out.println("The sum is: "+sum);
    }
}