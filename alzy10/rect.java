import java.util.Scanner;
class rect{
    int l,b;
    rect(){//default
        l=0;
        b=0;
    }
    
    void input(){ //public static void input()
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Breadth");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    
    int area(){
        return l*b;
    }
    
    public static void main(String args[]){
        rect ob=new rect();
        ob.input();
        int a=ob.area();
        rect ob2=new rect();
        ob2.input();
        int a1=ob2.area();
        System.out.println("Area one is: "+a+ " Area two is: "+a1);
    }
}