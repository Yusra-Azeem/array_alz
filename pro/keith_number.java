import java.util.Scanner;
class keith_number
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int m=0;
        for(int x=n;x!=0;x=x/10)
        {
            m++;
        }
        boolean keith=false;
        int sum=0;int div=1;
        int cp=n;
        if(m>1)
        {
            for(int x=n;x!=0;x=x/10)
            {
                m++;
                div=div*10;
            }div=div/10;
            int ar[]=new int[m];
            for(int x=0;x<m;x++)
            {
                ar[x]=cp/div;
                cp=cp%div;
                div=div/10;
            }
            while(sum<=n)
            {
                for(int x=0;x<m;x++)
                {
                    sum+=ar[x];
                }
                if(sum==n)
                {
                    keith=true;
                    break;
                }
                for(int x=0;x<=m-2;x++)
                {
                    ar[x]=ar[x+1];
                }
                ar[m-1]=sum;
                sum=0;
            }
        }
        else
        {
            if(n==1)
            {
                keith =true;
            }
        }
        if(keith==true)
        {
            System.out.println("Keith number");
        }
        else
        {
            System.out.println("n Keith number");
        }

    }
}