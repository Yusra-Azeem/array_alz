import java.util.Scanner;
class arNameMArks
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[20];
        String name[]=new String[20];
        boolean found=false;
        for(int x=0;x<name.length;x++){
            System.out.println("Enter name of students "+(x+1));
            name[x]=sc.next();
            System.out.println("Enter marks of students "+(x+1));
            marks[x]=sc.nextInt();
        }
        System.out.println("Stds who scored 85+ 40-");
        for(int x=0;x<marks.length;x++){
            if(marks[x]>=85 || marks[x]<40){
                
                found=true;
                System.out.println(name[x]);
            }
        }
        if(found==false){
            System.out.println("No stdts found in that range");
        }
        
    }
}