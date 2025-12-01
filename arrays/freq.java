import java.util.Scanner ;
class freq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[4];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("Enter no index "+x);
            n[x]=sc.nextInt();
        }
         System.out.println("number\tfrequency");
        for(int x=0;x<=100;x++)
        {
            int count=0;
            for(int y=0;y<n.length;y++)
            {

                if(n[y]==x)
                {
                    count++;
                }
            }
            if(count>=1)
            {
                System.out.println(n[x]+"\t"+count);
            }

        }
    }
}


