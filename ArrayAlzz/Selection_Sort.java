class Selection_Sort{
    public static void main(String args[]){
        int ar[]={7,1,8,5};
        for(int x=0;x<ar.length;x++){
            int index=x;
            for(int y=x+1;y<ar.length;y++){
                if(ar[index]>ar[y]){
                    index=y;
                }
                int t=ar[x];
                ar[x]=ar[index];
                ar[index]=t;
            }
        }
        for(int x=0;x<ar.length;x++){
        System.out.print(ar[x]+"\t");
        }
    }
}