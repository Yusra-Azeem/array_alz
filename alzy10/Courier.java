import java.util.Scanner;
class Courier
{
    String name;
    int weight;
    String address;
    int bill;
    char type;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter the weight of parcel");
        weight=sc.nextInt();
        System.out.println("Enter your address");
        address=sc.next();
        System.out.println("Parcel to be send International Type 'I' or Domestic TYpe 'D'");
        type=sc.next().charAt(0);
    }

    void calculate(){
        if(weight<=5) {
            bill=800;
        }
        else if(weight<=10){
            bill=700;
        }

        else{
            bill=500;
        }
        if(type=='I'){
            bill=bill+1500;
        }
    }

    void print(){
        System.out.println("Name: "+name);
        System.out.println("Parcel weight: "+weight);
        System.out.println("Bill is: "+bill);
    }

    public static void main(String args[]){
        Courier ob=new Courier();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}