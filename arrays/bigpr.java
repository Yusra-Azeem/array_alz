import java.util.Scanner;
class bigpr
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

        int big=0;

        for(int x=0;x<n.length;x++)
        {
            if(big<n[x])
            {
                boolean prime=true;
                for(int y=2;y<n[x]/2;y++)
                {
                    if(n[x]%y==0)
                    {

                        prime=false;
                        break;
                    }
                }
                if(prime==true)
                {
                    big=n[x];
                }
            }
            
        }
        System.out.println(big +" is biggest");
    }
}
