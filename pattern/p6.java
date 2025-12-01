class p6
{
    public static void main(String args[])
    {
       
        for(int x=5;x<=9;x++)
        {
            for(int y=x;y<=9;y++)
            {
                System.out.print(y);
            }
            for(int y=12;y<=x*2;y++)
            {
                System.out.print('.');
            }
            for(int y=(x==5?8:9);y>=x;y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
