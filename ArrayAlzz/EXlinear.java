import java.util.Scanner;
class EXlinear
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double ar[]=new double[5];
        int index=-1;
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter any number "+(i+1));
            ar[i] = sc.nextDouble();

        }
        System.out.println("Enter num to find it in array");
        double n = sc.nextDouble();
        for(int i=0;i<ar.length;i++){
            if(n==ar[i]){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("found at "+index);
        }
        else{
            System.out.println("Not found");

        }
    }
}