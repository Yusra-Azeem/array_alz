class prime
{
    public static void main(String args[])
    {
        int count=0;
        
        for(int x=100;x<=999;x++)
        {
            boolean prime=true;
            for(int y=2;y<=x/2;y++)
            {
                if(x%y==0)
                {
                   
                    prime=false;
                    break;
                }
            }
            if(prime==true)
            {
                System.out.println(x);
                 count++;
            }
        }
        System.out.println(count+" prime no");
    }
}
        
           
                    
                    
