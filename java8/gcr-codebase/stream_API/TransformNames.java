import java.util.Arrays;
import java.util.List;
public class TransformNames{
    public static void main(String[] args){
        List<String> names=Arrays.asList("sanjh", "aman", "shivam", "shivendra");
        names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
