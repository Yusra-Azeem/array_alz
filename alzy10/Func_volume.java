class Func_volume
{
    public static int volume(int c)
    {
        int cube=c*c*c;
        return cube;
    }
    public static double volume(double r)
    {
        double sphere=(4/3.0*22/7.0)*r*r*r;
        return sphere;
    }
    public static int volume(int l,int b,int h)
    {
        int cuboid =l*b*h;
        return cuboid;
    }
    public static void main(String args[])
    {
        int cub=volume(2);
        double sph=volume(4.0);
        int cubi=volume(3,4,5);
        System.out.println(cub+"\n"+sph+"\n"+cubi);
    }
}
        
        