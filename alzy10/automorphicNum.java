import java.util.Scanner;
class automorphicNum //num whose sq has sme digits in the end as the num itself eg: 25 its sqis 625 which contain "25 inlast"
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int t=n;
        int sq=n*n;
        boolean auto= true;
        while(t!=0)
        {
            int d=t%10;
            int s=sq%10;
            if(d!=s)
            {
                auto=false;
                break;
            }
            sq=sq/10;
            t=t/10;
        }
        if(auto)
        {
            System.out.println("Entered number is Automorphic");
        }
        else
        {
            System.out.println("Entered number is not Automorphic");
        }
    }
}
            
            