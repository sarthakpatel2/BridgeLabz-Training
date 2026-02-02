import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
public class DetectDuplicateCSV{
    public static void main(String[] args) {
        String filePath="io-programming-practice/gcr-codebase/CSV-handling/students.csv";
        Set<String> seenIds=new HashSet<>();
        boolean header=true;
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line=br.readLine()) !=null){
                //skip header
                if (header){
                    header=false;
                    continue;
                }
                String[] data=line.split(",");
                String id=data[0];
                //if ID already exists then duplicate
                if (!seenIds.add(id)){
                    System.out.println("Duplicate record found: "+line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
