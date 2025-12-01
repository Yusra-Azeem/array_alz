import java.util.Scanner ;
class perpr
{
    public static void main(String rags[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[2];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("Enter no index "+x);
            n[x]=sc.nextInt();
        }
        for(int x=0;x<n.length;x++)
        {
            int sum=0;
            for(int y= 1;y<n[x];y++)
            {
                if(n[x]%y==0)
                {
                    sum+=y;
                }
            }
            if(sum==n[x])
            {
                System.out.println(n[x]);
            }
        }
    }
}

        