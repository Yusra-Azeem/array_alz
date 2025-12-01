import java.util.Scanner;
class BEEnAry
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,8,9};
        int index=-1;
        int min=0;
        int max=ar.length-1;
        System.out.println("Enter num to be search");
        int n=sc.nextInt();
        while(min<=max){
            int mid=(min+max)/2;
            if(ar[mid]==n){
                index=mid;
                break;
            }
            else if(ar[mid]>n){
            max=mid-1;
            }
            else{
            min=mid+1;
            }
        }
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Found at "+index);
        }
    }
}