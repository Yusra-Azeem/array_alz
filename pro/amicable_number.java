import java.util.Scanner;
class amicable_number
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter second number");
        int n2=sc.nextInt();
        System.out.println(divisorsum(n1)+"k"+divisorsum(n2));
        if(divisorsum(n1)==n2&&divisorsum(n2)==n1)
        {
            System.out.println("Amicable number");
        }
        else
        {
            System.out.println("Not amicable number");
        }
    }
    public static int divisorsum(int n)
    {     
        int  s=0;
        for(int x=1;x<n;x++)
        { 
            if(n%x==0)
            {
                s=s+x;
            }
        }
        return s;  
    }
} 
        