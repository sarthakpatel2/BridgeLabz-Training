import java.util.*;
import java.util.regex.*;
public class Extraction{
    // Extract Email Addresses
    public static void extractEmails(String text) {
        String emailRegex="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern=Pattern.compile(emailRegex);
        Matcher matcher=pattern.matcher(text);
        System.out.println("Extracted Email Addresses:");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    //extract capitalized words
    public static void extractCapitalizedWords(String text) {
        String capRegex ="\\b[A-Z][a-z]*\\b";
        Pattern pattern=Pattern.compile(capRegex);
        Matcher matcher=pattern.matcher(text);
        System.out.println("\nCapitalized Words:");
        List<String> words=new ArrayList<>();
        while (matcher.find()){
            words.add(matcher.group());
        }
        System.out.println(String.join(", ",words));
    }
    public static void main(String[] args){
        // Example text for emails
        String emailText="Contact us at this@example.com and info@company.org";
        // Example text for capitalized words
        String sentence="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        extractEmails(emailText);
        extractCapitalizedWords(sentence);
    }
}
