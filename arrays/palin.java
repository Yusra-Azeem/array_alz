import java.util.Scanner ;
class palin
{
    public static void main(String rags[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[4];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("Enter no index "+x);
            n[x]=sc.nextInt();
        }
        for(int x=0;x<n.length;x++)
        {
           int r=0;
            for(int y=n[x];y!=0;y=y/10)
            {
                int d=y%10;
                r=r*10+d;
                
            }
            if(r==n[x])
            {
                System.out.println(n[x]);
            }
        }
    }
}
            
