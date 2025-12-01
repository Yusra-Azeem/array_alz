class pyramidPat4
{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print("");
            }
            for(int y=1;y<=i;y++){
                System.out.print(y);
            }
            for(int x=i;x>=1;x--){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}