import java.util.Scanner;
class DiagSum
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[4][4];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("Enter number "+(i+1));
                ar[i][j]=sc.nextInt();
            }
        }
        int sumL=0;
        int sumR=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(i==j){
                    sumL=sumL+ar[i][j];
                }
                if(i+j==5){
                    sumR=sumR+ar[i][j];
                }
            }
        }
        if(sumL==sumR){
            System.out.println("Diagonal");
        }
        else{
            System.out.println("NOT Diagonal");
        }
    }
}