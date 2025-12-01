class Book
{
    String name[];
    int point,max;
    Book(int cap)
    {
        this.max=cap;
        this.point=-1;
        this.name=new String[max];
    }
    void tell()
    {
        if(point==-1)
        {
            System.out.println("Shelf empty ");
        }
        else
        {
            System.out.println("the topmost book is"+name[point]);
        }
    }
    void add(String v)
    {
        this.point+=1;
        if(this.point==max)
        {
            System.out.println("shelf full");
        }
        else
        {
            this.name[this.point]=v;
        }
    }
}