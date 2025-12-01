import java.util.Scanner;
class SwitchShapes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Area of Square \n Enter 2 for Area of Rectangle \n Enter 3 for Area of Circle \n Enter 4 to check num Prime or not");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
            System.out.println("Enter side of the square");
            int s=sc.nextInt();
            int sq=s*s;
            System.out.println("Area of Square: "+sq);
            break;
            case 2:
            System.out.println("Enter length");
            int l=sc.nextInt();
            System.out.println("Enter breadth");
            int b=sc.nextInt();
            int rec=l*b;
            System.out.println("Area of Rectangle: "+rec);
            break;
            case 3:
            System.out.println("Enter radius of Circle");
            int r=sc.nextInt();
            int circ=(22/7)*r*r;
            System.out.println("Area of Circle: "+circ);break;
            case 4:
            System.out.println("Enter any number");
            int n1=sc.nextInt();
            boolean t=true;
            for(int x=2;x<n1;x++)
            {
                if(n1%x==0)
                {
                    t=false;
                    break;
                }
            }
            if(t==true)
            {
                System.out.println("Its a Prime Number");
            }
            else
            {
                System.out.println("Its not a Prime Number");
            }
            break;
            default:
            System.out.println("Invalid");
        }
    }
}