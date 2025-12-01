import java.util.Scanner;
class TrianglePattern
{
    public static void main(String args[])
    {
        int i=1;
        
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print((i++)+" "); 
            }
            System.out.println();
        }
    }
}