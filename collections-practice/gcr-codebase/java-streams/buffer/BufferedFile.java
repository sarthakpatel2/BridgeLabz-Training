import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedFile{
    public static void main(String[] args){
        String sourcePath = "collections-practice/gcr-codebase/java-streams/source.txt";
        String destPath = "collections-practice/gcr-codebase/java-streams/bufferedCopy.dat";
        byte[] buffer = new byte[4096]; 
        long startTime = System.nanoTime();
        try (
            BufferedInputStream bis =new BufferedInputStream(new FileInputStream(sourcePath));
            BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(destPath))
        ) {
            int bytesRead;
            while ((bytesRead =bis.read(buffer)) !=-1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Stream Time: "+(endTime - startTime) /1_000_000 +" ms");
    }
}
