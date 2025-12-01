import java.util.Scanner;
class YoungestPrint
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age[]=new int[4];
        String name[]=new String[4];
        
        for(int x=0;x<age.length;x++){
            System.out.println("Stdt "+(x+1)+" enter your age ");
            age[x]=sc.nextInt();
            System.out.println("Stdt " +(x+1)+" enter your name ");
            name[x]=sc.next();
        }
        int small=age[0];
        String sm_name=name[0];
        //int index=0;
        for(int y=1;y<age.length;y++){
            if(small>age[y]){
                small=age[y];
                sm_name=name[y];
                //index=y;
            }
        }
        //System.out.println("The youngest is "+name[index]);
    }
}