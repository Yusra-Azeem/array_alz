import java.util.Scanner;
class test_array
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int ar[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter number "+(x+1));
            ar[x]=sc.nextInt();
        }
        System.out.println("value of array");
        for(int x=0;x<=4;x++)
        {
            System.out.println(ar[x]);
        }
    }
}