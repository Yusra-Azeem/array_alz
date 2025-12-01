import java.util.Scanner;
class length_of_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String n[]=new String[3];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("Enter string at index "+x);
            n[x]=sc.nextLine();
        }
        for(int x=0;x<n.length;x++)
        {
            for(int y=0;y<n.length-1;y++)
            {
                if(n[y].length()>n[y+1].length())
                {
                    String  t=n[y];
                    n[y]=n[y+1];
                    n[y+1]=t;
                }
            }
        }
        for(int x=0;x<n.length;x++)
        {
            System.out.println(n[x]);
        }
    }
}
            