import java.util.Scanner;
class Biggestnum
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int big=0;

        for(int x=0;x<ar.length;x++){
            System.out.println("Enter num "+(x+1));
            ar[x]=sc.nextInt();
        }
        for(int y=0;y<ar.length;y++){
            if(prime(ar[y])==true&&big<ar[y]){
                big=ar[y];

            }

        }
        System.out.println("Biggest Prime num "+big);
    }

    public static boolean prime(int n){
        boolean p=true;
        for(int y=2;y<n;y++){
            if(n%y==0){
                p=false;
                break;
            }
            
        }
        return p;
    }
}