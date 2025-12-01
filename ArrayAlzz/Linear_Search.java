class Linear_Search
{
    public static void main(String args[]){
        int ar[]={4,5,8,2,10};
        int num=8;
        int index=-1;
        for(int i =0;i<ar.length;i++){
            if(ar[i]==num){
                index=i;
                break;
            }

        }
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index "+index);
        }
    }
}