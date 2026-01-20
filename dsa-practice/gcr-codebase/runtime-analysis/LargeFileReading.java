import java.io.*;
public class LargeFileReading{
    // method to read file using FileReader
    public static void readUsingFileReader(String filePath) {
        long startTime =System.currentTimeMillis();
        try (FileReader fr=new FileReader(filePath)) {
            int ch;
            while ((ch=fr.read()) !=-1){// reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("FileReader Time: "+(endTime -startTime)+ " ms");
    }
    //method to read file using InputStreamReader
    public static void readUsingInputStreamReader(String filePath) {
        long startTime=System.currentTimeMillis();
        try (InputStreamReader isr=new InputStreamReader(new FileInputStream(filePath))){
            int ch;
            while ((ch =isr.read()) !=-1){// reading character by character
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("InputStreamReader Time: "+(endTime-startTime)+" ms");
    }
    //main method
    public static void main(String[] args){
        String filePath="largefile.txt";
        System.out.println("Reading file using FileReader---");
        readUsingFileReader(filePath);
        System.out.println();
        System.out.println("Reading file using InputStreamReader---");
        readUsingInputStreamReader(filePath);
    }
}
