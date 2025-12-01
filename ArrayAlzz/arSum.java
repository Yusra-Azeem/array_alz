import java.util.Scanner;
import java.util.Scanner;
class arSum
{
    public static void main(String args[]){
        int ar[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int x=0;x<ar.length;x++){
            System.out.println("Enter number"+(x+1));
            ar[x]=sc.nextInt();
        }
        int sum=0;
        for(int x=0;x<ar.length;x++){
            sum=sum+ar[x];
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}