import java.util.Scanner;
class search_number
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        String nm[]=new String[5];
        int p[]=new int[5];
        for (int x=0;x<=4;x++)
        {
            System.out.println("Enter Name");
            nm[x]=sc.next();
            System.out.println("Enter Phone Number");
            p[x]=sc.nextInt();
        }

        System.out.println("Enter name you want to search");
        String name=sc.next();
        int index=-1;
        for(int x=0;x<=4;x++)
        {
            if(name.equals(nm[x]))
            {
                index=x;
            }
        }
        if(index==-1)
        {
            System.out.println ("error");
        }
        else 
        {
            System.out.println(nm[index]+" your Number is "+p[index]);
        }
    }
}
