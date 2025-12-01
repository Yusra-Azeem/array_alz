import java.util.Scanner;
class equal_string2
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter String1");
        String s1=sc.nextLine();
        System.out.println ("Enter String2");
        String s2=sc.nextLine();
        int check= 0;
        if (s1.equals(s2))
        {
            check=1;
        }
        if(check==1)
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
    }
}
       
