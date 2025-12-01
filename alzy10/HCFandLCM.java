import java.util.Scanner;
class HCFandLCM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n1=sc.nextInt();
        System.out.println("Enter any number");
        int n2=sc.nextInt();
        int min=n1<n2?n1:n2;
        int hcf=1;
        for(int x=min;x>=2;x--)
        {
            if(n1%x==0 && n2%x==0)
            {
                System.out.println("HCF is: "+x);
                hcf=x;
                break;
            }
        }
        System.out.println("LCM is: "+(n1*n2)/hcf);
    }
}
        