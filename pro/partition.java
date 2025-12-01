import java.util.Scanner;
class partition
{
    public static void partition(int n)
    {
        partition(n,n,"");
    }
    public static void partition(int n,int max,String prefix)
    {
        if(n==0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i=Math.min(max,n);i>=1;i--)
        {
            partition(n-i,i,prefix +" "+i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N to be partition : ");
        int n=sc.nextInt();
        System.out.println("All possible partitions of"+n+"are :");
        partition(n);
    }
}