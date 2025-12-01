class butter_fly
{
    public static void main(String args[])
    {
        for(int x=1;x<=4;x++)
        {
            for(int y=1;y<=4;y++)
            {
                if(y<=x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int y=1;y<=4;y++)
            {
                if(x+y>=5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int x=1;x<=4;x++)
        {
            for(int y=1;y<=4;y++)
            {
                if(x+y<=5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int y=1;y<=4;y++)
            {
                if(y>=x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

