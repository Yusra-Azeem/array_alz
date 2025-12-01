import java.util.Scanner;
class rank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m[]=new int[3];
        String s[]=new String[3];
        for(int x=0;x<m.length;x++)
        {
            System.out.println("Enter name of student "+(x+1));
            s[x]=sc.next();
            System.out.println("Enter marks");
            m[x]=sc.nextInt();
        }
        for(int x=0;x<m.length-1;x++)
        {
            int index=x;
            for(int y=x+1;y<m.length;y++)
            {
                if(m[index]<m[y])
                {

                    index=y;
                }
            }
            int t=m[x];
            m[x]=m[index];
            m[index]=t;
            String t1=s[x];
            s[x]=s[index];
            s[index]=t1;
        }
        int r=1;
        int p=0;
        for(int x=0;x<m.length;x++)
        {
            if(m[p]==m[x])
            {
                System.out.println(r+"\t"+s[x]);
            }
            else
            {
                System.out.println(r+"\t"+s[x]);
                r++;
            }
            
        }
        p++;
    }
}
                
                                    