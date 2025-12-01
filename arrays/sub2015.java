import java.util.Scanner;
class sub2015
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int no=sc.nextInt();
        int r[]=new int[no];
        String n[]=new String[no];
        int s1[]=new int [no];
        int s2[]=new int [no];
        int s3[]=new int [no];
        double av[]=new double[no];
        for(int x=0;x<r.length;x++)
        {
            System.out.println("Enter name of student "+(x+1));
            n[x]=sc.next();
            System.out.println("Enter roll no");
            r[x]=sc.nextInt();
            System.out.println("Enter marks sub 1");
            s1[x]=sc.nextInt();
            System.out.println("Enter marks sub 2");
            s2[x]=sc.nextInt();
            System.out.println("Enter marks sub 3");
            s3[x]=sc.nextInt();
        }
        for(int x=0;x<r.length;x++)
        {
            System.out.println("name of student  "+n[x]);
            System.out.println("roll no "+r[x]);
            
            av[x]=(s1[x]+s2[x]+s3[x])/3.0;
            System.out.print("remark ");
            if(av[x]>=85 && av[x]<=100)
            {
                System.out.println("excellent");
            }
            else if(av[x]>=75 && av[x]<=84)
            {
                System.out.println("distinction");
            }
            else if(av[x]>=60 && av[x]<=74)
            {
                System.out.println("first class");
            }
            else if(av[x]>=40 && av[x]<=59)
            {
                System.out.println("pass");
            }
            else
            {
                System.out.println("poor");
            }
        }
    }
}
        
        
 