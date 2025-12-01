class PAt10
{
    public static void main(String args[])
    {
        Pat();
    }
    static void Pat(){
        
        for(int i=1;i<=5;i++){
            int p=1;
            for(int j=1;j<=i;j++){
                System.out.print(p);//print i
                p=p==1?0:1;
            }
            System.out.println();
        }
    }
}
/*if(p==1){
    p=0;
}
else
{
    p=1}*/


        