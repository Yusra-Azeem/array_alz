class Non_Static_Sq
{
    int s=0;
    void input(int s)
    {
        this.s=s;
    }
    int area()
    {
        return s*s;
    }
    int perimeter()
    {
        return 4*s;
    }
    public static void main(String args[])
    {
        Non_Static_Sq ob=new Non_Static_Sq();
        ob.input(2);
        int a=ob.area();
        int p=ob.perimeter();
        System.out.println("Area is: "+a+" Perimeter is: "+p);
    }
}
        
        

        