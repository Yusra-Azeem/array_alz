class Aleena{  //demo para constructor
    int n;
    int m;
    Aleena(int n,int m){
        this.n=n;
        this.m=m;
    }
    Aleena(){
        n=0;
        m=0;
    }
    Aleena(int i){
        n=i;
        m=i;
    }
    int area(){
     return n*m;
    }
    public static void main(String args[]){
        //int n1=2;
        //int n2=5;
        Aleena ob1=new Aleena(2,5);
        System.out.println("n="+ob1.n+" m="+ob1.m+"area "+ob1.area());
        Aleena ob2=new Aleena();
        System.out.println(ob2.area());
        Aleena ob3=new Aleena(2);
        System.out.println(ob3.area());
    }
}