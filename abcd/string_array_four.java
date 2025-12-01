import java.util.Scanner;
class string_array_four
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        String ar[]=new String [4];
        for (int x=0;x<=3;x++)
        {
            System.out.println ("Enter string");
            ar[x]=sc.nextLine ();
        }

        System.out.println ("Enter element to find String");
        String s=sc.nextLine ();
        int c=-1;
        for (int x=0;x<=3;x++)
        {
            if (s.equals(ar[x]))
            {

                c=x;

            }
        
        }
        if (c==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println(s+" is found at "+c);
        }
    }
}
    

