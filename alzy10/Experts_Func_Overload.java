class Experts_Func_Overload
{
    double area(double a,double b,double c)
    {
        double s=(a+b+c)/2;
        double sa=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return sa;
    }
    double area(int a,int b,int height)
    {
        double trapezium=1/2*height*(a+b);
        return trapezium;
    }
    double area(double diagonal1,double diagonal2)
    {
        double rhombus=1/2*(diagonal1*diagonal2);
        return rhombus;
    }
    public static void main(String args[])
    {
        Experts_Func_Overload ob=new Experts_Func_Overload();
        double sa=ob.area(8.9,3.5,4.6);
        double trap=ob.area(7,4,8);
        double rhom=ob.area(7.8,3.9);
        System.out.println("Rhombus is: "+rhom+" Trapezium: "+trap+" Scalene triangle: "+sa);
    }
}