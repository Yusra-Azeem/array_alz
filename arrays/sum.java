import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of times ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int s[]=new int[n];
        for(int x=0;x<a.length;x++)
        {
            System.out.println("Enter value of Array A"+(x+1));
            a[x]=sc.nextInt();
            System.out.println("Enter value of Array B"+(x+1));
            b[x]=sc.nextInt();
        }
        for(int x=0;x<a.length;x++)
        {
            s[x]=a[x]+b[x];
        }
        System.out.println("Array A\tArray B\ts");
        for(int x=0;x<a.length;x++)
        {
            System.out.println(a[x]+"\t"+b[x]+"\t"+s[x]);
        }
    }
}