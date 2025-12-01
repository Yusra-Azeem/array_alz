import java.util.Scanner;
class upper_case_check
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter Sentence");
        String s=sc.nextLine();
        int l=s.length();
        int count=0;
        for (int x=0;x<=l-1;x++)
        {
            char c=s.charAt(x);
            if (Character.isUpperCase(c))
            {
                System.out.println(c);
                count++;
            }
        }
        System.out.println("total = "+count);
    }
}
        
    