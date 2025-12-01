import java.util.Scanner;
class biggest
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
        int big=ar[0];
        for(int x=1;x<=4;x++)
        {
            if(big<ar[x])
            {
                big=ar[x];
            }
        }
        System.out.println("bigest "+big);
    }
}
