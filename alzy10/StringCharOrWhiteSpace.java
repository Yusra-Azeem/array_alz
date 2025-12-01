import java.util.Scanner;
class StringCharOrWhiteSpace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        boolean f=false;
        int l= s.length();
        for(int x=0;x<l-1;x++)
        {
            char ch=s.charAt(x);
            if(ch==' ')
            {
                f=true;
                break;
            }
            
        }
        if(f==true)
        {
            System.out.println("Space is found");
        }
        else
        {
            System.out.println("Space is not found");
        }
    }
    }
