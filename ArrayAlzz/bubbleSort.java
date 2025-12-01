import java.util.Scanner;
class bubbleSort
{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter number "+(i+1));
            ar[i]=sc.nextInt();
        }
        for(int x=0;x<ar.length-1;x++){
            for(int y=0;y<ar.length-1;y++){
                if(ar[y]>ar[y+1]){
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        for(int j=0;j<ar.length;j++){
            System.out.println(ar[j]);
        }
    }
}