import java.util.Scanner;
class Matrix_rearr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int a[]={1,2,5,8};
        int b[][]=new int[n][n];
        for(int x=0;x<b.length;x++)
        {
            for(int y=0;y<b.length-x;y++)
            {
                b[y][x]=a[x];
            }
        }
        int m=1;
        for(int x=b.length-1;x>=0;x--)
        {
            int m2=0;
            for(int y=m;y<b.length;y++)
            {
                b[y][x]=a[m2++];
            }m++;
        }
        for(int x=0;x<b.length;x++)
        {
            for(int y=0;y<b.length;y++)
            {
                System.out.print(b[x][y]+"\t");
            }
            System.out.println();
        }
    }
}

