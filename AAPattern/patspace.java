class patspace
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++){
            //for(int j=4;j>=i;j--){ 
                for(int j=i;j<=4;j++){
                System.out.print(" ");  //    //
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);//    1
            }
            System.out.println();
        }
    }
}