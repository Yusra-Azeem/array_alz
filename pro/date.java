import java.util.Scanner;
class date
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date");
        String d=sc.next();
        String ar[]=d.split("/");
        int dd[]={31,Integer.parseInt(ar[2])%4==0?29:28,31,30,31,30,31,31,30,31,30,31};
        String m[]={"January","Febraury","March","April","May","June","July","August","September","October","November","December"};
        if(Integer.parseInt(ar[0])<=dd[Integer.parseInt(ar[1])-1]&&Integer.parseInt(ar[1])<=12)
        {
            System.out.print(ar[0]);
            if(Integer.parseInt(ar[0])==1)
            {
                System.out.print("st");
            }
            else if(Integer.parseInt(ar[0])==2)
            {
                System.out.print("nd");
            }
            else
            {
                System.out.print("th");
            }
            System.out.print(" "+m[Integer.parseInt(ar[1])-1]+" "+Integer.parseInt(ar[2]));
        }
        else
        {
            System.out.println("invalid");
        }
    }
}