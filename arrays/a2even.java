import java.util.Scanner;
class a2even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n[]=new int[5];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("Enter no"+(x+1));
            n[x]=sc.nextInt();
        }
        boolean found =false;
        System.out.println("Even no");
        for(int x=0;x<n.length;x++)
        {
            if(n[x]%2==0)
            {
                System.out.println(n[x]);
                found =true;
            }
        }
        if(found==false)
        {
            System.out.println("not found");
        }
    }
}

        
        