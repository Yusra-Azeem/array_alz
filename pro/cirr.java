class cirr
{
    public static int cir(int n)
    {
        int m=1;
        int x=n;
        while(n!=0)
        {
            m*=10;
            n=n/10;
        }
        m=m/10;
        int p=x%m;
        return p*10+(x/m);
    }
}