import java.util.Scanner;
class en
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sentence ");
        String s=sc.nextLine();
        int e=s.charAt(s.length()-1);
        if(e=='.'||e==','||e=='?'||e=='!')
        {
            s.toUpperCase();
            s=s.substring(0,s.length()-1);
            int count=0;s=s+" ";
            for(int x=0;x<s.length();x++)
            {
                char ch=s.charAt(x);
                if(ch==' ')
                {
                    count++;
                }
            }
            String w="";int c=0;
            String a[]=new String[count];
            int b[]=new int[count];int i1=0,i2=0,sum=0;
            for(int x=0;x<s.length();x++)
            {
                char ch=s.charAt(x);
                if(ch!=' ')
                {
                    w=w+ch;
                    c++;
                }
                else
                {
                    for(int y=0;y<c;y++)
                    {
                        sum=sum+(int)(w.charAt(y)-64);
                    }
                    b[i2++]=sum;
                    a[i1++]=w;
                    w="";
                    sum=0;
                    c=0;
                }
            }
            for(int x=0;x<a.length;x++)
            {
                System.out.println(a[x]+" = "+b[x]);
            }
            for(int x=0;x<a.length-1;x++)
            {
                for(int y=0;y<a.length-2;y++)
                {
                    if(b[y]>b[y+1])
                    {
                        int t1=b[y];
                        String t=a[y];
                        b[y]=b[y+1];
                        a[y]=a[y+1];
                        b[y+1]=t1;
                        a[y+1]=t;
                    }
                }
            }
            for(int x=0;x<a.length;x++)
            {
                System.out.print(a[x]+" ");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }

}