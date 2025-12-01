import java.util.Scanner;
class reverse_a_string
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter String");
        String s=sc.nextLine();
        int l=s.length();
        String s2="";
        for (int x=l-1;x>=0;x--)
        {
            char c=s.charAt(x);
            s2=s2+c;
        }
        if (s.equals(s2))
        {
            System.out.println("It palindrme");

        }
        else
        {
            System.out.println("It not palindrme");
        }
    }
}
        

