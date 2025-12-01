import java.util.Scanner;
class IncomeTax
{
    int age;
    String gender;
    double IncomeTax;
    IncomeTax(){
        gender="";
        age=0;
        IncomeTax=0.0;
    }

    double income(double TI){
        if(TI<160000){
            IncomeTax=0.0;
        }
        else if(TI>160000 || TI<=500000){
            IncomeTax=(TI-160000)*10/100;
        }
        else if(TI>500000 || TI<=800000){
            IncomeTax=((TI-500000)*20/100)+34000;
        }
        else if(TI>800000){
            IncomeTax=((TI-800000)*30/100)+94000;
        }
        return IncomeTax;
    }

    boolean detail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your gender");
        gender=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();
        boolean valid=true;
        if(age>65 || gender.equalsIgnoreCase("female")){
            System.out.println("Wrong category");
            valid=false;
        }
        return valid;
    } 

    void display(double TI){
        System.out.println("Age is: "+age+" \nGender is: "+gender+" \nTaxable Income: "+TI);
    }

    public static void main(String args[])
    {
        IncomeTax ob= new IncomeTax();
        Scanner sc=new Scanner(System.in);
        if(ob.detail()==true){
            System.out.println("Enter your Taxable Income: ");
            double TI=sc.nextDouble();
            System.out.println("Income Tax to be paid: "+ob.income(TI));
            
            ob.display(TI);
            
        }
        
    }
}
