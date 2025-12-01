class pat
{
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            int p=1;
            for(int j=1;j<=5;j++){
                System.out.print(p);
                p=p==1?2:1;
            }
            System.out.println();
        }
    }
}