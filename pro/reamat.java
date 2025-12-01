import java.util.Scanner;
class reamat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int M=sc.nextInt();
        int ar[][]=new int[M][M];
        
        int a[]=new int[s];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                System.out.println("Enter element at "+(x+1)+","+(y+1));
                ar[x][y]=sc.nextInt();
            }
        }
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
        
        for(int x=0;x<ar.length-1;x++)
        {
            for(int y=0;y<ar.length-1;y++)
            {
                if(ar[x][y]>ar[x][y+1])
                {
                    int t=ar[x][y];
                    ar[x][y]=ar[x][y+1];
                    ar[x][y+1]=t;
                }
            }
        }

        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }
}