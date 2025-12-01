import java.util.Scanner;
class upper_case
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter word");
        String w=sc.nextLine();
        String w2=w.toUpperCase();
        System.out.println(w2);
    }
}
        
    
    