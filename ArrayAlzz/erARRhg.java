import java.util.Scanner;
class erARRhg
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];
        for(int x=0;x<ar.length;x++){
            System.out.println("Enter number "+(x+1));
           ar[x]=sc.nextInt();       
        }
        System.out.println("Entered nums are: ");
        for(int x=0;x<ar.length;x++){
           System.out.println(ar[x]);       
        }
        
    }
}
 