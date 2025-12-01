import java.util.Scanner;
class pyramidPat2
{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int y=5;y>=i;y--){
                System.out.print(y);
            }
            for(int x=i+1;x<=5;x++){
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }
}