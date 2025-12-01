import java.util.Scanner;
class SmallestNum
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];  
        
        for(int x=0;x<ar.length;x++){
            System.out.println("enter num "+(x+1));
            ar[x]=sc.nextInt();
        }
        int small=ar[0];
        for(int y=1;y<ar.length;y++){
            if(ar[y]<small){
                small=ar[y];
            }
        }
        System.out.println("Smallest Num "+small);
    }
}