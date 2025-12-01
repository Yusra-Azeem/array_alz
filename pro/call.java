class call
{
    public static void main(String args[])
    {
        Intwrapper a=new Intwrapper(30);
        Intwrapper b=new Intwrapper(40);
        swapfunc(a,b);
    }
    public static void swapfunc(int a,int b)
    {
        System.out.println("Before swapping a = "+a+",b= "+b);
        Intwrapper c=new Intwrapper(a.a);
        a.a=b.a;
        b.a=c.a;
        System.out.println("After swapping a = "+a+",b= "+b);
    }
    class Intwrapper
    {
        public static int a;
        public Intwrapper(int a);
    }
}