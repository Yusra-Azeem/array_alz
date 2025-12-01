class pat3
{
    public static void main(String args[]){
        for(int i=9;i>=5;i--){
            for(int j=i;j>5;j--){
                System.out.print(" ");
            }
            for(int y=9;y>=i;y--){
                System.out.print(y);
            }
            for(int x=i+1;x<=9;x++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}