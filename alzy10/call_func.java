import java.util.*;
class call_func{
     public static void table(int w){
        for(int x=1;x<=10;x++){
            System.out.println(w+"x"+x+"="+(w*x));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter num");
        int n=sc.nextInt();W
        table(n);
        System.out.println("Enter num");
        int n1=sc.nextInt();
        table(n1);*/
        System.out.println("Enter num");//display
        int n=sc.nextInt();
        boolean p=isprime(n);
        System.out.println(p);
        for(int x=2;x<=100;x++)
        {
            // boolean k=isprime(x);
            if(isprime(x))
            {
                System.out.println(x);
            }
        }
    }

   

    public static boolean isprime(int num){
        //boolean t=true;
        for(int x=2;x<num;x++)
        {
            if(num%x==0)
            {
                return false;    //t=false;
                //break;
            }
        }
        return true; //return t;
    }

}