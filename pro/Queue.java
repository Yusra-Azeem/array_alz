class Queue
{
    int Que[],front,rear,size;
    Queue(int mm)
    {
        size=mm;
        front=-1;
        rear=-1;
    }

    void add(int v)
    {
        if(rear==size-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            if(rear==-1)
            {
                front=0;rear=0;
                Que[rear]=v;
            }
            else
            {
                Que[++rear]=v;
            }
        }
    }

    int delete()
    {
        if(front==-1)
        {
            return -999;
        }
        else
        {
            System.out.println(Que[front]+"is deleted ");
            if(front==rear)
            {
                front=rear=-1;
            }
            else
            {
                front++;
            }
            return Que[front];
        }
    }
}
 