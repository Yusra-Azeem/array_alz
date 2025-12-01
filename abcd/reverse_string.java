import java.util.Scanner;
class reverse_string
{
    public static void main  (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter string");
        String s=sc.nextLine();
        int l =s.length();
        String s2="";
        for (int x=l-1;x>=0;x--)
        {
            char c=s.charAt (x);
            s2=s2+c;
        }
        System.out.println (s2);
    }
}

    