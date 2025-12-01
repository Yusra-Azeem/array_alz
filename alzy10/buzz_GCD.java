import java.util.Scanner;
class buzz_GCD
{ 
    static int GCD(int n,int n1){
        int a=Math.min(n,n1);
        int b=Math.max(n,n1);    
        while(b%a!=0){
            int t=a;
            a=b%a;
            b=t;
        }
        return a;
    }

    static boolean buzz(int n){
        if(n%7==0||n%10==7)
        {
            return true;
        }

        return false;

    } 

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 to check Buzz Number /n Enter number 2 to get GCD");
        int num=sc.nextInt();
        switch (num)
        {
            case 1: 
            System.out.println("Enter any number");
            int b=sc.nextInt();
            
            if(buzz(b)){
            System.out.println("Its a buzz number");
        }
            else{
            System.out.println("Not a buzz number");
            }
       
            break;
            case 2: 
            
            System.out.println("Enter two numbers");
            int a=sc.nextInt();
            int c=sc.nextInt();
            System.out.println("GCD is: "+GCD(a,c));
        }
    }
}