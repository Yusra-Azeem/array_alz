import java.util.Scanner;
class mobike2011
{
    int bno;
    long phno;
    String name;
    int days;
    int charge;
    mobike2011()
    {
        bno=0;
        phno=0;
        name="";
        days=0;
        charge=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bike's number");
        bno=sc.nextInt();
        System.out.println("Enter phone number");
        phno=sc.nextLong();
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter number of days bike is taken");
        days=sc.nextInt();
    }
    void compute()
    {
        if(days<=5)
        {
            charge=days*500;
            
        }
        else if(days<=10)
        {
            charge=(days-5)*400+5*500;
        }
        else{
            charge=5*500+5*400+(days-10)*200;
        }
    }
    void display()
    {
        System.out.println("Bike no.\tPhone No.\tNo. of Days\tCharge");
        System.out.println(bno+"\t\t"+phno+"\t\t"+days+"\t"+charge);
    }
    public static void main(String args[])
    {
        mobike2011 ob= new mobike2011();
        ob.input();
        ob.compute();
        ob.display();
    }
}
        
            