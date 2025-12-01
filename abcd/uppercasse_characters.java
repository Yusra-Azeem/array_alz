import java.util.Scanner;
class uppercasse_characters
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        char ar[]=new char [5];
        for (int x=0;x<=4;x++)
        {
            System.out.println ("Eneter char");
            ar[x]=sc.next().charAt (0);
        }
        int v=0;
        for  (int x=0;x<=4;x++)
        {
            if (ar[x]=='a'||ar[x]=='e'||ar[x]=='i'||ar[x]=='o'||ar[x]=='u')
            {
                System.out.println (ar[x]);
                v++;
            }
        }
        System.out.println ("number vowels "+v);
        int u=0;

        for  (int x=0;x<=4;x++)
        {
            if (Character.isUpperCase(ar[x]))
            {
                System.out.println (ar[x]);
                u++;

            }
        }
        System.out.println ("all uppercase number "+u); 
    }

}
