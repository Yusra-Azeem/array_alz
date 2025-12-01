import java.util.Scanner;
class word
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sentence");
        String s=sc.nextLine();
        String r="";
        int sp=1;
        String nw="";
        int e=s.charAt(s.length()-1);
        int c=0;
        String w="";
        if(e=='.'||e=='?'||e=='!')
        {
            System.out.println("Enter word to be deleted");
            String d=sc.next();
            for(int x=0;x<s.length();x++)
            {
                char ch=s.charAt(x);
                if(ch!=' ')
                {
                    r=r+ch;
                    sp=0;
                }
                else
                {
                    if(sp==0)
                    {
                        r=r+" ";
                        sp=1;
                    }
                }
            }
            System.out.println("no sp "+r);
            for(int x=0;x<r.length();x++)
            {
                char ch=r.charAt(x);
                if(ch!=' ')
                {
                    w=w+ch;
                    nw=nw +ch;c++;
                }
                else
                {
                    if(w.equalsIgnoreCase(d))
                    {
                        nw=nw.substring(0,(x-c));
                    }
                    else
                    {
                        nw=nw+" ";c=0;w="";
                    }
                }
                System.out.println("New sentence "+nw);
            }
        }
        else
        {
            System.out.println("invalid input");
        }

    }
}