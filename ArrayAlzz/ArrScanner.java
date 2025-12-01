import java.util.Scanner;
class ArrScanner
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];
        System.out.println("Enter 4 num");
        ar[0]=sc.nextInt();
        ar[1]=sc.nextInt();
        ar[2]=sc.nextInt();
        ar[3]=sc.nextInt();
        System.out.println("Entered num are: "+ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t"+ar[3]);
    }
}