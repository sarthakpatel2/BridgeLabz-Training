import java.util.Arrays;
import java.util.List;
public class EmailNotification{
    static void sendEmailNotification(String email){
        System.out.println("Sending email to: "+email);
    }
    public static void main(String[] args){
        List<String> emails=Arrays.asList(
            "sanjh@gmail.com",
            "ayushi@gmail.com",
            "akriti@gmail.com"
        );
        emails.forEach(email ->sendEmailNotification(email));
    }
}
