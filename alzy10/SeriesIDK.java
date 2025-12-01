import java.util.Scanner;
class SeriesIDK
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        for(int x=1;x<=10;x++)
        {
            sum=sum+(double)x/(x-11);
        }
        System.out.println("The sum is: "+sum);
    }
}