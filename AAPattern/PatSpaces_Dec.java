class PatSpaces_Dec
{
    public static void main(String [] args){
        for(int i=8;i>=4;i--){
            for(int j=5;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=8;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

