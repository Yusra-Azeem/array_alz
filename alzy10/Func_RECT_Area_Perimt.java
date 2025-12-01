import java.util.Scanner;
class Func_RECT_Area_Perimt
{
    static int n;
    static int n1;
    public static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Breadth");
        n=sc.nextInt();
        n1=sc.nextInt();
    }

    public static int area(int l,int b)
    {
        int area = l*b;
        return area;
    }

    public static int perimeter(int l,int b)
    {
        int perimeter = 2*(l+b);
        return perimeter;
    }
    /*public static void perimeter2(int l,int b)
    {
        int perimeter = 2*(l+b);
        System.out.println(perimeter);
    }*/
    public static void display(int h)
    {
        System.out.println(h);
    }
    public static void main(String args[])
    {
        input();
        //perimeter2(n,n1);
        int p=perimeter(n,n1);
        int a=area(n,n1);
        display(p);
        display(a);
        //System.out.println("area: "+a+ "\nperimeter: "+p);
    }
}