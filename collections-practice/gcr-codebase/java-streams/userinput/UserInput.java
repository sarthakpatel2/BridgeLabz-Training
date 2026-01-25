import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class UserInput{
    public static void main(String[] args) {
        try (
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer=new FileWriter("user_details.txt")
        ) {
            System.out.print("Enter your name: ");
            String name =br.readLine();
            System.out.print("Enter your age: ");
            String age =br.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language =br.readLine();
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            System.out.println("User details saved successfully");
        }catch (IOException e){
            System.out.println("An error occurred while reading input or writing to file");
            e.printStackTrace();
        }
    }
}
