import java.util.Scanner;
class ini
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        s=s.trim();
        s=" "+s;
        int l=s.length();
        int i=s.lastIndexOf(' ');
        for(int x=0;x<=i-2;x++)
        {
            char c1=s.charAt(x);
            char c2=s.charAt(x+1);
            if(c1==' ')
            {
                System.out.print(Character.toUpperCase(c2)+"."+" ");
            }
        }
        System.out.print(Character.toUpperCase(s.charAt(i+1)));
        String t=s.substring(i+2);
        t=t.toLowerCase();
        System.out.println(t);
    }
}

        
        
        