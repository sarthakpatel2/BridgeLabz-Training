import java.util.*;
import java.util.regex.*;
public class RepeatingWords{
    public static void main(String[] args){
        String text="This is is a repeated repeated word test.";
        String regex="\\b(\\w+)\\s+\\1\\b";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(text);
        Set<String> repeatedWords =new LinkedHashSet<>();
        while (matcher.find()){
            repeatedWords.add(matcher.group(1));
        }
        System.out.println(String.join(", ", repeatedWords));
    }
}
