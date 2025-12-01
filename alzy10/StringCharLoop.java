import java.util.Scanner;
class StringCharLoop
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        for(int x=1;x<=10;x++)
        {
            System.out.println("Enter any String");
            String s =sc.nextLine();
            char c =s.charAt(0);
            if(c=='a'||c=='A')
            {
                count++;
            }
        }
        System.out.println("number of string starting with A or a are: "+count);
    }
}