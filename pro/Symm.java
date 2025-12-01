import java.util.Scanner;
class Symm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        boolean sym=true;
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                System.out.println("Enter number at "+(x+1)+","+(y+1));
                ar[x][y]=sc.nextInt();
            }
        }
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                System.out.println(ar[x][y]+"\t");
            }
            System.out.println();
        }
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar.length;y++)
            {
                if(ar[x][y]!=ar[y][x])
                {
                    sym=false;
                    break;
                }
            }
        }
        if(sym==true)
        {
            System.out.println("Symmetric matrix");
        }
        else
        {
            System.out.println("Not Symmetric matrix");
        }
    }
}