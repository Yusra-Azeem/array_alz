import java.util.Scanner;
class fre
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int s=sc.nextInt();
        int ar[]=new int[s];
        for(int x=0;x<s;x++)
        {
            System.out.println("Enter no at index "+x);
            ar[x]=sc.nextInt();
        }
        System.out.println("number\tfrequency");
        for(int x=0;x<s;x++)
        {
            int count=0;
       
            for(int y=0;y<s;y++)
            {
                if(ar[x]==ar[y])
                {
                    count++;
                }
            }

            System.out.println(ar[x]+"\t"+count);
        }
    }
}
        