import java.util.Scanner;
class Discount_Func
{
    int discount,netAmt;
    Discount_Func(){
        discount=0;
        netAmt=0;
    }

    int disc(int TicAmt){
        if(TicAmt>70000){
            discount= 18;
        }
        else if(TicAmt>=55001 && TicAmt<=70000){
            discount=16;
        }
        else if(TicAmt>=35001 && TicAmt<=55000){
            discount=12;
        }
        else if(TicAmt>=25001 && TicAmt<=35000){
            discount=10;
        }
        else if(TicAmt<25001){
            discount=2;
        }
        return discount;
    }

    int calc(int TicAmt,int discount){
        netAmt=TicAmt-(discount*TicAmt)/100;
        return netAmt;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int x=1;x<=15;x++){
            System.out.println("Enter your name");
            String name=sc.next();
            System.out.println("Enter your Ticket Amount");
            int TicAmt=sc.nextInt();
            Discount_Func ob=new Discount_Func();
            int d=ob.disc(TicAmt);
            int namt=ob.calc(TicAmt,d);
            System.out.println("SL.NO\t Name\t Ticket Charges\t\tDiscount\tNet Amount");
            System.out.println(x+"\t"+name+"\t\t"+TicAmt+"\t\t"+d+"\t\t"+namt);
        }
    }
}

