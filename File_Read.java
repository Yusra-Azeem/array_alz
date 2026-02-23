import java.io.*;
class File_Read
{
    public static void main(String args[])throws IOException{
        try{
            FileReader fr=new FileReader("File1.txt");
            BufferedReader br=new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null){

                System.out.println(s);
            }
            
            br.close();
            fr.close();
        }
        
        catch(Exception e){
            System.out.println("ERr");
        }
    }
}
 