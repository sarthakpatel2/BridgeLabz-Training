import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
public class ValidateCSVData{
    private static final String EMAIL_REGEX ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    public static void main(String[] args){
        String filePath="collections-practice/gcr-codebase/CSV-handling/users.csv";
        Pattern emailPattern=Pattern.compile(EMAIL_REGEX);
        String line;
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine(); //skip header
            while ((line=br.readLine()) != null){
                String[] data=line.split(",");
                String email=data[2];
                String phone=data[3];
                boolean valid=true;
                if (!emailPattern.matcher(email).matches()){
                    System.out.println("Invalid Email: "+line);
                    valid=false;
                }
                if (!phone.matches("\\d{10}")){
                    System.out.println("Invalid Phone: "+line);
                    valid=false;
                }
                if (!valid) {
                    System.out.println("Invalid Row Detected\n");
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
