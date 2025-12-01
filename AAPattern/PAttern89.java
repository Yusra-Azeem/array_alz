class PAttern89
{
    public static void main(String args[])
    {
        Pat();
    }
    static void Pat(){
        int p=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p++);//print i
            }
            System.out.println();
        }
    }
}
        