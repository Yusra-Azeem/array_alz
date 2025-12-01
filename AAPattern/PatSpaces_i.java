class PatSpaces_i
{
    public static void main(String args[]){
        for(int i=9;i>=5;i--){
            for(int j=i;j<=8;j++){
                System.out.print(" ");
            }
            for(int j=5;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}