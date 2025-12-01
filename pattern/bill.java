import java.util.Scanner;
class bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        int ci=0 ;
        int co=0;
        do
        { int c=0,sum=0;
           

            do
            {
                c++;
                System.out.println("enter price of item "+c);
                int p=sc.nextInt();
                sum+=p;
                System.out.println("more items(y/n)");
                ch=sc.next().charAt(0);
            }while(ch=='y'||ch=='Y');
            System.out.println("more customers(y/n)");
            ch=sc.next().charAt(0);
            ci++;
            System.out.println("bill of customer "+ci+ " = "+sum);
            
            co+=sum;
            
            

        }while(ch=='y'||ch=='Y');
        System.out.println("total collection = "+co);
    }
}
       