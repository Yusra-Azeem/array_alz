class overloadFunc
{
    double perform(double r,double h){
        double l=Math.sqrt(r*r+h*h);
        double csa=22/7*r*l;
        return csa;
    }

    void perform(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void perform(int m,int n,char ch){
        if(ch=='Q'){
            System.out.println(m/n);
        }
        else{
            System.out.println(m%n);
        }
    }

    public static void main(String args[]){
        overloadFunc ob=new overloadFunc();
        double csa=ob.perform(4.5,2.3);
        System.out.println(csa);
        ob.perform(3,5);
        ob.perform(6,3,'Q');
    }
}