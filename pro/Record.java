import java.util.Scanner;
public class Record
{
    String names[];
    int rnk[];
    Record()
    {
        names=new String[5];
        rnk=new int[5];
    }

    void readvalues()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Name of student "+(i+1));
            names[i]=sc.next();
            System.out.println("Rank of student "+(i+1));
            rnk[i]=sc.nextInt();
        }
    }

    void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Name "+names[i]+"Rank :"+rnk[i]);
        }
    }
}
class Rank extends Record
{

    int index;
    Rank()
    {
        super();
        index=0;
    }

    void highest()
    {
        int max=rnk[0];index=0;
        for(int i=1;i<5;i++)
        {
            if(max<rnk[i])
            {
                index=1;
            }
        }
    }

    void display()
    {
        super.display();
        System.out.println("Name of Topmoster ranker is "+names[index]);
    }
}

 