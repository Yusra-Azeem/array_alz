import java.util.Scanner;
class happy
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=n;
        boolean happy_num=false;
        if(s==1)
        {
            happy_num=true;
        }
        while(s/10!=0)
        {
            int sum=0;
            for(int x=s;x!=0;x=x/10)
            {  
                int d=s%10;
                sum+=d*d;
                s=s/10;
            }
            
            s=sum;
            if(sum==1)
            {
                happy_num=true;
                break;
            }
            sum=0;
        }
        if(happy_num==false)
        {
            System.out.println(n+" is not a happy number");
        }
        else
        {
            System.out.println(n+" is a happy number");
        }
    }
}
    

 
