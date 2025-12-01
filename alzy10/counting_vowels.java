import java.util.Scanner;
class counting_vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String v=sc.nextLine();
        int count=0;
        String n=v.toLowerCase();
        for(int x=0;x<=n.length()-1;x++)
        {
            char ch=n.charAt(x);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        System.out.println("NO. of vowels are: "+count);
    }
}
