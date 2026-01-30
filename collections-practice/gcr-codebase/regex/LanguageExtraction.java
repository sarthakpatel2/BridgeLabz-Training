import java.util.*;
import java.util.regex.*;
public class LanguageExtraction{
    public static void main(String[] args){
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex= "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        List<String> languages=new ArrayList<>();
        while (matcher.find()){
            languages.add(matcher.group());
        }
        System.out.println(String.join(", ",languages));
    }
}
