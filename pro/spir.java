import java.util.Scanner;
class spir
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int m=sc.nextInt();
        System.out.println("Enter no of columns");
        int n=sc.nextInt();
        int i=1,r=0,c=-1,p=1;
        int ar[][]=new int[m][n];
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                switch(p)
                {
                    case 1:
                    c++;break;

                    case 2:
                    r++;break;

                    case 3:
                    c--;break;

                    case 4:
                    r--;

                    case 5:
                    p=1;c=1;

                }
                ar[r][c]=i++;
                if((c==n-1&&r==0)||(r==m-1&&c==n-1)||(r==m-1&&c==0)||(r==1&&c==0))
                {
                    p++;
                }
            }
        }
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }
}