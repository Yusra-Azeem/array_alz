import java.util.Scanner;
class f2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array a");
        int m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("Enter size of array b");
        int n=sc.nextInt();
        int b[]=new int[n];
        int c[]=new int[m+n];
        for(int x=0;x<m;x++)
        {
            System.out.println("Enter no at index "+x);
            a[x]=sc.nextInt();
        }
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter no at index "+x);
            b[x]=sc.nextInt();
        }
        System.out.println("array c");
        int i=0;
        for(int y=0;y<m+n;y++)
        {
            for(int x=0;x<m;x++)
            {
                c[i]=a[x];
                i++;
            }
            for(int x=0;x<n;x++)
            {
                c[i]=b[x];
            }

            System.out.print(c[y]+"   ");
        }
    }
}

        
