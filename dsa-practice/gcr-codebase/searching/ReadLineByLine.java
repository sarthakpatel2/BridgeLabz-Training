import java.io.*;
public class ReadLineByLine {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("sample.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while ((line=br.readLine()) !=null){
            System.out.println(line);
        }
    }
}
