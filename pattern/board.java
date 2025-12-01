class board
{
    public static void main(String args[])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x+y>=6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int y=4;y>=x;y--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}