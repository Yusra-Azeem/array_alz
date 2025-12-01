class p10
{
    public static void main(String args[])
    {
        for(int x=1;x<=9;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x+y<=6||x-y>=4)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
                    