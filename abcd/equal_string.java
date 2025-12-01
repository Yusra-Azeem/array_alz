import java.util.Scanner;
class equal_string
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter String1");
        String s1=sc.nextLine();
        System.out.println ("Enter String2");
        String s2=sc.nextLine();
        boolean check= false;
        if (s1.equals(s2))
        {
            check=true;
        }
        if(check==true)
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
    }
}
       
