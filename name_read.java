import java.io.*;
class name_read
{
    public static void main(String args[])throws IOException{
        //input
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //write
        FileWriter fw = new FileWriter("Names.Txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw =new PrintWriter(bw);
        for(int i=0;i<3;i++){
            System.out.println("Enter your name: "+(i+1));
            String name=br.readLine();
            pw.println(name);
        }
        pw.close();
        br.close();
    }
}