class buble
{
    public static void main(String args[]){
        int ar[]={5,7,2,3,1};
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-1;j++){
                if(ar[j]>ar[j+1]){
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        for(int j=0;j<ar.length;j++){
            System.out.print(ar[j]);
        }
    }
}