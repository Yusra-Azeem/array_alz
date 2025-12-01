import java.util.Scanner;
class TWO_D_Arraydiag
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[2][2];//2x2 daigonal matrix
        
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("Enter numbers ");
                ar[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The matrix is: original");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                
                System.out.print(ar[i][j]+" ");
                
            }
            System.out.println();
        }
        System.out.println("The matrix is: transport");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                
                System.out.print(ar[j][i]+" ");
                
            }
            System.out.println();
        }
    }
}