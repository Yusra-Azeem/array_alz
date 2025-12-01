import java.util.Scanner;
class TWO_D_Array
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[3][3];
        
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("Enter numbers ");
                ar[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The matrix is: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}