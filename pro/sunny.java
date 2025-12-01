import java.util.Scanner;
class sunny
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n1=sc.nextInt();
        double sq=Math.sqrt(n1+1);
        String s1=String.valueOf(sq);
        int i=s1.indexOf('.');
        String s2=s1.substring(i+1,i+2);
        int n2=Integer.parseInt(s2);
        if(n2>0)
        {
            System.out.println(n1+" is not a Sunny number");
        }
        else
        {
            System.out.println(n1+" is a Sunny number");
        }
    }
}
        
        