import java.util.Scanner;
class countpr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[4];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("Enter number "+(x+1));
            
            n[x]=sc.nextInt();
        }
        int count=0;
        boolean prime=true;
        for(int x=0;x<n.length;x++)
        {
            for(int y=2;y<n[x]/2;x++)
            {
                if(n[x]%y==0)
                {
               
                    prime=false;
                    break;
                }
            }
            if(prime==true)
            {
                count++;
            }
        }
        System.out.println(count+" prme num");
    }
}
           