class p4
{
    public static void main(String args[])
    {
        for(int x=9;x>=5;x--)
        {
            
            for(int y=x;y<=8;y++)
            {
                System.out.print(" ");
            }
            for(int y=5;y<=x;y++)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}