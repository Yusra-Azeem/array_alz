class cir
{
    public static void ciru(int n)
    {
        int m=1;int x=n;
        while(x!=0)
        {
            m=10*m;
            x=x/10;
        }m=m/10;
        int a=n%m;
        int b=n/m;
        m=m/10;
        System.out.println(a*m+b);
    }
}