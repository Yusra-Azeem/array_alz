import java.util.Scanner;
class a1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[5];
        int m[]=new int[5];
        for(int x=0;x<m.length;x++)
        {
            System.out.println("Enter name of student"+(x+1));
            n[x]=sc.next();
            System.out.println("Enter marks");
            m[x]=sc.nextInt();
        }
        System.out.println("Student getting less than 40");
        for(int x=0;x<m.length;x++)
        {
            if(m[x]<40)
            {
                System.out.println(n[x]);
            }
        }
        System.out.println("Student getting 40 or less than or 60");
        for(int x=0;x<m.length;x++)
        {
            if(m[x]>=40&&m[x]<60)
            {
                System.out.println(n[x]);
            }
        }
        System.out.println("Student getting more than 60");
        for(int x=0;x<m.length;x++)
        {
            if(m[x]>60)
            {
                System.out.println(n[x]);
            }
        }
    }
}
            