class p3pajama
{
    public static void main(String args[])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(x);
            }

            for(int y=1;y<=9-x*2;y++)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=x;y++)
            { 
                if(!(x==5&&y==1))
                System.out.print(x);
            }
            System.out.println();
        }
    }
}