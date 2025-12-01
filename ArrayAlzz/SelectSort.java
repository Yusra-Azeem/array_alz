class SelectSort
{
    public static void main(String args[]){
        int ar[]={4,9,5,2,3};
        for(int i=0;i<ar.length;i++){
            int min=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min=j;
                }
                int t=ar[min];
                ar[min]=ar[i];
                ar[i]=t;
            }
            System.out.print(ar[i]);
        }
    }
}