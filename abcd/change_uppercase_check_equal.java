import java.util.Scanner;
class change_uppercase_check_equal
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter String1");
        String s1=sc.nextLine();
        System.out.println ("Enter String2");
        String s2=sc.nextLine();
        String su1=s1.toUpperCase();
        String su2=s2.toUpperCase();
        if (su1.equals(su2))
        {
            System.out.println ("It equal");
        }
        else
        {
            System.out.println ("It not equal");
        }
        int l1=su1.length();
        int l2=su2.length();
        if(l1>l2)
        {
            System.out.println ("It has bigger length "+s1);
        }
        else if (l2>l1)
        {

            System.out.println ("It has bigger length "+s2);
        }
        else
        {
            System.out.println ("It has equal length");
        }
          
    }
}
