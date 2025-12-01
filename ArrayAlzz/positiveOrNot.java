import java.util.Scanner;
class positiveOrNot
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<ar.length;x++){
            System.out.println("Enter num "+(x+1));
            ar[x]=sc.nextInt();
        }
        boolean n=true;
        for(int y=0;y<ar.length;y++){
            if(ar[y]<=0){
                n=false;
                break;
            }
            
        }
        if(true==n){
                System.out.println("All positive num");
            }
            
        else{
                System.out.println("Atleast one is negative num or zero present");
            }
    }
}