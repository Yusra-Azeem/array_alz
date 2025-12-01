import java.util.Scanner;
class ArEVEN
{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int [10];
        int even=0,odd=0;
        for(int x=0;x<ar.length;x++){
            System.out.println("Enter number "+(x+1));
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<ar.length;x++){
            if(ar[x]%2==0){
                even+=ar[x];
            }else
            {
                odd+=ar[x];
            }
        }
        
        System.out.println("even"+even+"\nodd"+odd);
        
    }
}