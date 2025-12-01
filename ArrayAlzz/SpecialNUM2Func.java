import java.util.Scanner;
class SpecialNUM2Func
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            int fact=facto(d);

            sum=sum+fact;
        }
        System.out.println(sum);
        if(t==sum){
            System.out.println("Its a Special num");
        }
        else{
            System.out.println("Not a special num");
        }
    }

    public static int facto(int d){
        int fact=1;
        for(int y=1;y<=d;y++){
            fact=y*fact;
            
        }
        return fact;
    }
}