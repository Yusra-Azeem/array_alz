import java.util.Scanner;
class last_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String w=sc.next();
        int l= w.length();
        char c=w.charAt(l-1);
        System.out.println(c);
    }
    
    
    
 
        
    
    
}
        