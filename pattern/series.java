class series 
{
    void series ()
    {
        for(int x =1;x <=5;x++)
        {
            for(int y=x;y>=1;y--)
            {
                System.out.print(1);
            }
            System.out.print(" ");
        }
    }
    void series(int x)
    {
        double  S=0.0;
       for(int y=1;y<=3;y++)
        {
            S=S+Math.pow(x,y);
            if(y%2==0)
            {
                S=S-Math.pow(x,y);
            }
        }
        System.out.println("Sum = "+S);
    }
    public static void main(String args [])
    {
        series ob=new series ();
        System.out.println("function with no Argument");
        ob.series();
        System.out.println("\nfunction with one argument and some");
        ob.series(10);
    }
}
        
                
            
            
           