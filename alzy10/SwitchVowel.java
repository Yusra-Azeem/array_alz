import java.util.Scanner;
class SwitchVowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int a=0,e=0,i=0,o=0,u=0;
        int l=s.length();
        for(int x=0;x<=l-1;x++)
        {
            char ch=s.charAt(x);
            switch(ch)
            {
                case 'a':
                a++;break;
                case 'e':
                e++;break;
                case 'i':
                i++;break;
                case 'o':
                o++;break;
                case 'u':
                u++;break;
            }
        }
        //System.out.println("a="+a+"\ne="+e+"\ni="+i+"\no="+o+"\nu="+u);
        if(a!=0)
        {
            System.out.println("a="+a);
        }
        if(e!=0)
        {
            System.out.println("e="+e);
        }
        if(i!=0)
        {
            System.out.println("i="+i);
        }
        if(o!=0)
        {
            System.out.println("o="+o);
        }
        if(u!=0)
        {
            System.out.println("u="+u);
        }
    }

}

