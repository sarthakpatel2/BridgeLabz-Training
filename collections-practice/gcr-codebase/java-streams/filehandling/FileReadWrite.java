import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileReadWrite{
    public static void main(String[] args){
        File sourceFile =new File("collections-practice/gcr-codebase/java-streams/source.txt");
        File destinationFile =new File("collections-practice/gcr-codebase/java-streams/destination.txt");
        //check if source file exists
        if (!sourceFile.exists()){
            System.out.println("Source file does not exist");
            return;
        }
        //try-with-resources to handle stream closing
        try(
            FileInputStream fis=new FileInputStream(sourceFile);
            FileOutputStream fos=new FileOutputStream(destinationFile)
        ){
            int data;
            while ((data =fis.read()) !=-1) {
                fos.write(data);
            }
            System.out.println("File copied successfully");
        } catch (IOException e){
            System.out.println("Error occurred during file operation");
            e.printStackTrace();
        }
    }
}
