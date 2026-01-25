import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class UpperToLower{
    public static void main(String[] args) {
        String sourceFile="collections-practice/gcr-codebase/java-streams/source.txt";
        String destinationFile="collections-practice/gcr-codebase/java-streams/lowercase.txt";
        try (
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            int ch;
            while ((ch =br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }
            System.out.println("File converted from uppercase to lowercase successfully");
        } catch (IOException e) {
            System.out.println("Error during file conversion");
            e.printStackTrace();
        }
    }
}
