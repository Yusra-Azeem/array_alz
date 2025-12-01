import java.util.Scanner;
class prfill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of m");
        int m=sc.nextInt();
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int ar[][]=new int[m][n];
        int i=2;
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(prime(i))
                {
                    ar[x][y]=i;
                }
                else
                {
                    y--;
                }
                i++;
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
    public static boolean prime(int n)
    {
        for(int x=2;x<n;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
}