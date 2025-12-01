import java.util.Scanner;
class sorting
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int ar []=new int [4];
        for(int x=0;x<=3;x++)
        {
            System.out.println("Enter number");
            ar[x]=sc.nextInt();
        }

        for(int x=0;x<=3;x++)
        {
            for(int y=0;y<=2;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        
        for(int x=0;x<=3;x++)
        {
            System.out.print(ar[x]+"  ");
        }
    }
}
 