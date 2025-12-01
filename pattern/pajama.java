import java.util.Scanner;
class pajama
{
    public static void main(String[] args)
    {
        Scanner sc =  new  Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        for(int x=0;x<s.length();x++)
        {
            for(int y=x;y<s.length();y++)
            {
                char ch=s.charAt(y);
                System.out.print(ch);
            }
            for(int y=x*2-1;y>=0;y--)
            {
                System.out.print(" ");
            }
            for(int y=(x==4?s.length()-(x+2):s.length()-(x+1));y>=0;y--)
            {
                char ch=s.charAt(y);

                System.out.print(ch);
            }
            System.out.println();
        }

    
    }
}
