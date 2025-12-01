import java.util.Scanner;
class TWO_D_Border
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int [3][3];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("Enter numbers: ");
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(i==0 || j==0 || i==2 || j==2)
                    System.out.print(ar[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}