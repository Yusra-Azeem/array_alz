import java.util.Scanner;
class Sales{
    String name;
    int pro_code;
    int pro_size;
    double price;
    Sales(){
        pro_code=0;
        pro_size=0;
        name="";
        price=0.0;
    }

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter the product code");
        pro_code=sc.nextInt();
        System.out.println("Enter the product size");
        pro_size=sc.nextInt();
        System.out.println("Enter the price of product");
        price=sc.nextDouble();
    }
    void discount(){
    price=price-10/100*price;
    }
    void display(){
    System.out.println("Product name is: "+name+"\nProduct code is: "+pro_code+"\nProduct size is: "+pro_size+"\nProduct price is: "+price);
    }
    public static void main(String [] args){
    Sales ob=new Sales();
    ob.input();
    ob.discount();
    ob.display();
    }
}