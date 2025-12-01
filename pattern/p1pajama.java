class p1pajama 
{
    public static void main(String args[])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y<=5;y++)
            {
                System.out.print(y);
            }
            for(int y=1;y<=x*2-3;y++)
            {
                System.out.print(" ");
            }
            for(int y=5;y>=x;y--)
            {
                if(!(x==1&&y==5))
                {
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }
}


        
        