import java.util.Scanner;
class big
{
    public static void main(String ags[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[4];
        for(int x=0;x<n.length;x++)
        {
            System.out.println("e"+x);
            n[x]=sc.nextInt();
        }
        int small=n[0];
        int big=n[0];
       
        int sum=n[0];
        for(int x=1;x<n.length;x++)
        {
            if(big<n[x])
            {
                big=n[x];
            }
            if(small>n[x])
            {
                small=n[x];
            }
            sum=sum+n[x];
        }
        
            System.out.println("big ="+big+"\nsmall="+small+"\nsum="+sum);
        
    

    }
    
}