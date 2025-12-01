class p9
{
    public static void main(String args[])
    {
        int p=65;
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x-y>=2||y+x>=8||y-x>=2||x+y<=4)
                {
                    System.out.print((char)p++);
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

