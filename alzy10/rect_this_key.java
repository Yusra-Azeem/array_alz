class rect_this_key{
    int l,b;
    rect_this_key(){//default
        l=0;
        b=0;
    }
    
    /*void input(int x,int y){ //public static void input()
        l=x;
        b=y;
    }*/
    void input(int l,int b){
        this.l=l;
        this.b=b;
    }
    
    int area(){
        return l*b;
    }
    
    public static void main(String args[]){
        rect_this_key ob=new rect_this_key();
        ob.input(2,3);
        int a=ob.area();
        rect_this_key ob2=new rect_this_key();
        ob2.input(5,6);
        int a1=ob2.area();
        System.out.println("Area one is: "+a+ " Area two is: "+a1);
    }
}