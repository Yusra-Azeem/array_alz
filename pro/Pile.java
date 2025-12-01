class Pile
{
    int ar[];
    int capacity,top;
    Pile(int cap)
    {
        capacity=cap; 
        top=-1;
        ar=new int[cap];
    }
    void push(int v)
    {
        if(top==(capacity-1))
        {
            System.out.println("Pile is full");
        }
        else
        {
            ar[++top]=v;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            return -9999;
        }
        else
        {
            int v=ar[top];
            top--;
            return v;
        }
    }
}