import java.util.Scanner;
class ArEVEN
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int [5];
        boolean found=false;
        for(int x=0;x<ar.length;x++){
            System.out.println("Enter number "+(x+1));
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<ar.length;x++){
            if(ar[x]%2==0){
                System.out.println(ar[x]);
                found=true;
            }
        }
        if(found==false){
        System.out.println("No even num found");
        }
    }
}