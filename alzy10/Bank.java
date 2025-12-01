import java.util.Scanner;
class Bank
{
    double p;
    double n;
    double r;
    double a;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount ");
        p=sc.nextDouble();
        System.out.println("Enter the number of year");
        n=sc.nextDouble();
    }

    void calculate(){
        if(n<=1/2){
            r=9;

        }
        else if(n>1/2 && n<=1){
            r=10;

        }
        else if(n>1 && n<=3){
            r=11;

        }
        else{
            r=12;

        }
        a=p*Math.pow(1+r/100,(n));
    }

    void display(){
        System.out.println("Principal \t Time \t Rate \tAmount ");
        System.out.println(p+"\t"+n+"\t"+r+"\t"+a);
    }

    public static void main(String args[]){
        Bank ob=new Bank();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}