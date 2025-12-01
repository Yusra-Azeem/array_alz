import java.util.Scanner;
class Student2010
{
    int age;
    String name;
    double m1,m2,m3,maximum,average;
    Student2010(){
        age=0;
        name="";
        m1=0.0;
        m2=0.0;
        m3=0.0;
        maximum=0.0;
        average=0.0;
    }
    void detail()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
    }
    void compute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of three subjects");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        double sum=m1+m2+m3;
        average=sum/3.0;
        //Math.max(Math.max(m1,m2),m3);
        //maximum=m1>m2?(m1>m3?m1:m3):(m2>m3?m2:m3);
        if(m1>m2)
        {
           if(m1>m3)
           {
               maximum=m1;
            }
            else{
                maximum=m3;
            }
        }
        else{
            if(m2>m3)
            {
                maximum=m2;
            }
            else{
                maximum=m3;
            }
        }
        
        
    }
    void display()
    {
        System.out.println("Average is: "+average+"\nMaximum marks is: "+maximum);
        System.out.println("Name is: "+name+"\nAge is: "+age+"\nMarks of 3 subjects: "+m1+"  "+m2+"  "+m3);
    }
    public static void main(String args[])
    {
        Student2010 ob=new Student2010();
        ob.detail();
        ob.compute();
        ob.display();
    }
}
        
        