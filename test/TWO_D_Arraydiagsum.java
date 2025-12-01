import java.util.Scanner;
class TWO_D_Arraydiagsum
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[3][3];
        int sum=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("Enter numbers ");
                ar[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The matrix is: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(i==j|| i+j==2){
                    sum+=ar[i][j];
                }
                    
            }
            System.out.println();
        }
        System.out.println("sum "+sum);
    }
}