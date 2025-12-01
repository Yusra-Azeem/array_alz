import java.util.Scanner;
class vowel
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
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println(c);
                count++;
            }
        }
        System.out.println("total = "+count);
    }
}
        
    