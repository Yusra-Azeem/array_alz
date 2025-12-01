class p2pajama 
{
    public static void main(String args[])
    {
        for(int x=3;x<=7;x++)
        {
            
            for(int y=x;y<=7;y++)
            {
                System.out.print(y);
            }
            for(int y=1;y<=x*2-7;y++)
            {
                System.out.print(" ");
            }
            for(int y=7;y>=x;y--)
            {
                if(!(x==3&&y==7))
                
                System.out.print(y);
            }
            
            
            System.out.println();
        }
    }
}
            
        