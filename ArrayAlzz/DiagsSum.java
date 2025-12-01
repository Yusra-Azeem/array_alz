import java.util.Scanner;
class DiagsSum
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
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=0;j<ar[i].length;j++){
                sum=sum+ar[i][j];
            }
            System.out.println("sum of row "+(i+1)+" "+sum);
        }
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}