class space_pattrn
{
    public static void main(String args[])
    {
        boolean b=true;
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=4+x;y++)
            {

                if(x+y>=6)
                {   
                    if(b)
                    {System.out.print(x);
                     b=false;
                    }
                    else{
                        System.out.print(" ");
                        b=true;
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            b=true;
            System.out.println();
        }
    }
}