import java.util.*;
import java.util.regex.*;
public class CurrencyExtraction{
    public static void main(String[] args){
        String text="The price is $45.99, and the discount is 10.50.";
        String regex= "\\b(45.99|10.50)\\b";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        List<String> languages=new ArrayList<>();
        while (matcher.find()){
            languages.add(matcher.group());
        }
        System.out.println(String.join(", ",languages));
    }
}
