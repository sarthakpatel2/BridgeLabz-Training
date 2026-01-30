import java.util.*;
import java.util.regex.*;
public class LinkExtraction{
    public static void main(String[] args){
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String urlRegex="https?://[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern=Pattern.compile(urlRegex);
        Matcher matcher= pattern.matcher(text);
        List<String> links=new ArrayList<>();
        while (matcher.find()){
            links.add(matcher.group());
        }
        System.out.println(String.join(", ", links));
    }
}
