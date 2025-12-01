class IdentityMatrix
{
    public static void main(String args[]){
        boolean id=true;
        int ar[][]={{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        outer:
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if((i==j && ar[i][j]!=1) || (i!=j && ar[i][j]!=0)){
                    id=false;
                    break outer;
                }
            }
        }
        System.out.println(id==true?"identity matrix":"Not a Identity matrix");
    }
}