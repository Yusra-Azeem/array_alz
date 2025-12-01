class sum_Func_overload{
    public static void sum(int n1,int n2){
        int sum=n1+n2;
        System.out.println(sum);
    }
    public static void sum(double n1,double n2){
        double sum=n1+n2;
        System.out.println(sum);
    }
    public static void sum(int n1,int n2,int n3){
        int sum=n1+n2+n3;
        System.out.println(sum);
    }
    public static void sum(int n1,int n2,int n3,int n4){
        int sum=n1+n2+n3+n4;
        System.out.println(sum);
    }
    public static void sum(int n1,int n2,int n3,int n4,int n5){
        int sum=n1+n2+n3+n4+n5;
        System.out.println(sum);
    }
    public static void main(String args[]){
        sum(1,2);
        sum(9.0,7.8);
        sum(1,2,3);
        sum(1,2,3,4);
        sum(1,2,3,4,5);
    } }