import java.util.Scanner;
class palin
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter string");
        String s=sc.next();
        String r="";
        int l=s.length();
        for(int x=0;x<=l-1;x++)
        {
            char c=s.charAt(x);
            r=c+r;
        }
        System.out.println(r);
    }
}