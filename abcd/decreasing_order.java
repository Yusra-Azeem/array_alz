import java.util.Scanner;
class decreasing_order
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int ar[]=new int[5];
        for (int x=0;x<=4;x++)
        {
            System.out.println ("Enter number");
            ar[x]=sc.nextInt();
            

        }
        for (int x=0;x<=4;x++)
        {
            for (int y=0;y<=3;y++)
            {
                if (ar [y]<ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        for (int x=0;x<=4;x++)
        {
            System.out.println ( ar[x]);

        }
    }
}

