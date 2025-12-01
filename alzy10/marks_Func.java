import java.util.Scanner;
class marks_Func
{
    double avg,max,m1,m2,m3;
    int age;
    String name;
    marks_Func(double m1,double m2,double m3,int age,String name){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.age=age;
        this.name=name;
        
    }
    /*marks_Func(){
        m1=0;
        m2=0;
        m3=0;
        age=0;
        name="";
        
    }*/

    void detail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter your marks of subj1");
        m1=sc.nextInt();
        System.out.println("Enter your marks of subj2");
        m2=sc.nextInt();
        System.out.println("Enter your marks of subj3");
        m3=sc.nextInt();
    }

    void compute(){
        double sum=m1+m2+m3;
        avg=sum/3.0;
        max=Math.max(Math.max(m1,m2),m3);
    }
    void display(){
    System.out.println("Name is: "+name+"\n Age is: "+age+"\nMarks are: "+m1 + m2 + m3+"\nMaximum marks: "+max+"\nAverage is: "+avg);
    }
    public static void main(String [] args)
    {
        marks_Func ob= new marks_Func(0.0,0.0,0.0,0,"");
        ob.detail();
        ob.compute();
        ob.display();
    }
}
