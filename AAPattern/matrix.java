class matrix
{
    public static void main(String args[]){
        for(int x=1;x<=3;x++){
            for(int y=1;y<=3;y++){
                if(x==y || x+y==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}