import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadCSVInChunks{
    public static void main(String[] args){
        String filePath="io-programming-practice/gcr-codebase/CSV-handling/large.csv";
        int batchSize=100;  //to process 100 at a time
        int totalCount= 0;
        int batchCount=0;
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            //skip header
            br.readLine();
            while ((line=br.readLine()) !=null){
                batchCount++;
                totalCount++;
                //when batch size reached
                if (batchCount==batchSize){
                    System.out.println("Processed records so far: "+totalCount);
                    // reset batch counter
                    batchCount=0;
                }
            }
            //print remaining records if any
            if (batchCount>0){
                System.out.println("Processed records so far: "+totalCount
                );
            }
            System.out.println("Total records processed: "+totalCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
