import java.util.Scanner;
class Smallest_largest_Num
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[4];  
        
        for(int x=0;x<ar.length;x++){
            System.out.println("enter num "+(x+1));
            ar[x]=sc.nextInt();
        }
        int small=ar[0];//let the first ele assume to be smallest
        int large=ar[0];//can let 0 as well 
        for(int y=1;y<ar.length;y++){
            if(ar[y]<small){//finding if any ele is lesser< than value in small then store in small
                small=ar[y];
            }
            if(ar[y]>large){//finding if any ele is greater> than value in small then store in large
                large=ar[y];
            }
        }
        System.out.println("Smallest Num "+small);
        System.out.println("biggest "+large);
    }
}