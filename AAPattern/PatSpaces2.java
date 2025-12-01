class PatSpaces2
{
    public static void main(String args[]){
        for(int i=5;i<=9;i++){
            for(int j=i;j<=8;j++){
                System.out.print(" ");
            }
            for(int j=5;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}