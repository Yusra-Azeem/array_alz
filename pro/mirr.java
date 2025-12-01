import java.util.Scanner;
class mirr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int m=sc.nextInt();
        System.out.println("Enter no column");
        int n=sc.nextInt();
        int ar[][]=new int[m][n];
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.println("enter no at");
                ar[x][y]=sc.nextInt();
            }
        }
        System.out.println("Original matrix\t\t\tmirror");
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.print("\t");
            for(int z=n-1;z>=0;z--)
            {
                System.out.print(ar[x][z]+"\t");
            }
            System.out.println();
        }
    }
}
 