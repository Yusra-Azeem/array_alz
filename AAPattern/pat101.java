class pat101
{
    public static void main(String args[]){
        int p=1;
        for(int x=1;x<=5;x++){
            
            for(int y=1;y<=x;y++){
                System.out.print(p);
                p=p==1?0:1;
            }
            System.out.println();
        }
    }
}