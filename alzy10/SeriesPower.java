import java.util.Scanner;
class SeriesPower //1/1*1+1/2*2+1/3*3....
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        double sum=0.0;
        for(int x=1;x<=n;x++)
        {
            sum=sum+1.0/(x*x);
                    }
        System.out.println("The sum is: "+sum);
    }
}