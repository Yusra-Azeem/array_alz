import java.util.Scanner;
class unique_w
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String n=sc.next();
        boolean uni=true;
        
            for(int x=0;x<n.length();x++)
            {
                for(int y=x+1;y<n.length()-1;y++)
                {

                    if(n.charAt(x)==n.charAt(y))
                    {
                        uni=false;
                        break;
                    }
                }
            
        }
        if(uni==false)
        {
            System.out.println("not");
        }
        else
        {
            System.out.println("uni");
        }
    }
}