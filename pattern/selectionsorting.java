import java.util.Scanner;
class selectionsorting

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[3];
        for(int x=0;x<ar.length;x++)
        {
            System.out.println("Enter number at index "+x);
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<ar.length-1;x++)
        {
            int index=x;
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y]<ar[index])
                {
                    index=y;
                }
            }
            int t=ar[x];
            ar[x]=ar[index];
            ar[index]=t;
        }
        for(int x=0;x<ar.length;x++)
        {
            System.out.println(ar[x]+" ");
        }
    }
}
 