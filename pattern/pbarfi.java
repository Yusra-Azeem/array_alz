class pbarfi
{
    public static void main(String args[])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=4;y>=x;y--)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            for(int y=x-1;y>=1;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
            
        for(int x=4;x>=1;x--)
        {
           for(int y=4;y>=x;y--)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
            for(int y=x-1;y>=1;y--)
            {
                System.out.print(y);
            } 
            System.out.println();
        }
    }
}
