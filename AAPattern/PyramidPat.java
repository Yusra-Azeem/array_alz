class PyramidPat
{
    public static void main(String [] args){
        for(int i=4;i<=8;i++){
            for(int j=i;j<=7;j++){
                System.out.print(" ");
            }
            for(int j=4;j<=i;j++){
                System.out.print(j);
            }
            for(int x=i-1;x>=4;x--){
            System.out.print(x);
            }
            System.out.println(" ");
        }
    }
}