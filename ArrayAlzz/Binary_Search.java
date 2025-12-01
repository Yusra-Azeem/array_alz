class Binary_Search
{
    public static void main(String args[]){
        int ar[]={2,5,7,8,9};
        int min=0;
        int max=ar.length-1;
        int index=-1;
        int target=7;
        while(min<=max){
            int mid=(min+max)/2;
            if(ar[mid]==target){
            index=mid;
            break;
            }
            else if(ar[mid]>target){
            max=mid-1;
            }
            else{
            min=mid+1;
            }
        }
        if(index==-1){
        System.out.println("Not found");
        }
        else{
        System.out.println("Num found at index "+index);
        }
    }
}