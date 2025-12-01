import java.util.*;
class Account extends Bank
{
    double amt;
    Scanner sc=new Scanner(System.in);
    Account(String n,String acc,double pr)
    {
        super(n,acc,pr);
        amt=0.0;
    }

    void deposit()
    {
        System.out.println("Enter amount you have to deposit ");
        amt=sc.nextDouble();
        p=p+amt;
    }

    void withdraw()
    {
         System.out.println("Enter amount you have to withdraw ");
        amt=sc.nextDouble();
        p=p-amt;
        if(p<500)
        {
            p=(p-(500-p))/10;
        }
    }

    void display()
    {
        super.display();
    }

    public static void main(String args[])
    {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter Name");
        String n1=sc1.nextLine();
        System.out.println("Enter Account number");
        String acc1=sc1.next();
        System.out.println("Enter Principle");
        double pr1=sc1.nextDouble();
        Account ob=new Account(n1,acc1,pr1);
        {
            System.out.println("**OUTPUT**");
            ob.deposit();
            ob.display();
            ob.withdraw();
            ob.display();
        }
    }
}
