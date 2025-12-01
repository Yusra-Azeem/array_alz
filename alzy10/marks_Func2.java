import java.util.Scanner;
class marks_Func2
{
    double avg,max,m1,m2,m3;
    int age;
    String name;
    marks_Func2(double m1,double m2,double m3,int age,String name){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.age=age;
        this.name=name;
        
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
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String namee=sc.next();
        System.out.println("Enter your age");
        int agee=sc.nextInt();
        System.out.println("Enter your marks of subj1");
        double ma1=sc.nextInt();
        System.out.println("Enter your marks of subj2");
        double ma2=sc.nextInt();
        System.out.println("Enter your marks of subj3");
        double ma3=sc.nextInt();
        marks_Func2 ob= new marks_Func2(ma1,ma2,ma3,agee,namee);*/
        marks_Func2 ob= new marks_Func2(12,12,63,2,"hgjhgh");
        ob.compute();
        ob.display();
    }
}
