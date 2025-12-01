import java.util.Scanner;
class sentence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String s=sc.nextLine();

        String p="";
        int f=0;
        char c=s.charAt(s.length()-1);

        s=s.substring(0,s.length()-1);
        s=s+" ";
        if(c=='!'||c=='?'||c==';')
        {
            for(int x=0;x<s.length();x++)
            {
                char ch=s.charAt(x);
                if(ch!=' ')
                {
                    p=p+ch;
                }
                else
                {
                    if(palin(p))
                    {
                        f++;
                        System.out.println(p);
                    }
                    p="";
                }
            }
            System.out.println(f);
        }
        else
        {
            System.out.println("invalid input");
        }
    }

    public static boolean palin(String w)
    {
        int l=w.length();
        String r="";
        for(int x=l-1;x>=0;x--)
        {
            r=r+w.charAt(x);
        }
        if(r.equals(w))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
