import java.util.Scanner;
class CountWhiteSpaceLoop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        int count =0;
        int l = s.length();
        for(int x=0;x<l-1;x++)
        {
            char ch=s.charAt(x);
            if(ch==' ')
            {
                count++;
            }
        }
        System.out.println("Blank spaces it consist: "+count);
    }
}