import java.util.Scanner;
class RevArr
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[3];
        for(int x=0;x<ar.length;x++){
            System.out.println("Enter any number");
        ar[x]=sc.nextInt();
        }
        for(int x=ar.length-1;x>=0;x--){
        System.out.println(ar[x]);
        }
    }
}