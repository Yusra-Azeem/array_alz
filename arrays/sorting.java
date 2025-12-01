import java.tuil.Scanner;
class sorting
{
    public static void main(string args[])
    {
        Scanner sc=new Scanner (System.in);
        int ar[]=new int[5];
        for(int x=0;x<ar.length;x++)
        {
            System.out.prinln("Enter number at index "+x);
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<ar.length-1;x++)
        {
            int index=x;
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y]>ar[x])
                {
                   index=y;
                }
                