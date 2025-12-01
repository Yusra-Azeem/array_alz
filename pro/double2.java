import java.util.Scanner;
class double2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre any string");
        String s=sc.nextLine();
        int l=s.length();
        int count=0;
        for(int x=0;x<l-1;x++)
        {
            char c1=s.charAt(x);
            char c2=s.charAt(x+1);
            if(c1==c2)
            {
                count++;
            }
        }
        System.out.println(count+" double letter sequences");
    }
}
        