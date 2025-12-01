import java.util.Scanner;
class Counting2PresentOrNot //Counting if the entered no. has digit 2 andhow many times prsnt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int count=0;
        while(n!=0)
        {
            int d=n%10; //10 se div karnepe input kia hua ke last digit deta remainder 
            n=n/10;
            if(d==2)
            {
                count++;
            }
        }
        if(count!=0)
        {
            System.out.println("No. of 2's it consist: "+count);
        }
        else 
        {
            System.out.println("It doesn't contain no. 2");
        }
    }
}
   