import java.util.Scanner;
class count_space
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter Sentence");
        String s=sc.nextLine ();
        int l = s.length();
        int count=0;
        for (int x=0;x<=l-1;x++)
        {
            char c=s.charAt(x);
            if (c==' ')
            {
                
                count++;
            }
        }
        System.out.println(count);
    }
}
            
            
           
      
            
        
        
        
        
       
       