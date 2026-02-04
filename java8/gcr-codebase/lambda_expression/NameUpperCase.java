import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NameUpperCase{
    public static void main(String[] args){
        //employee names list
        List<String> employees=Arrays.asList("Sarthak","Sanjh","Ayushi","Akriti");
        //convert names to uppercase using method reference
        List<String> upperCaseNames=employees.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Employee Names in Uppercase:-");
        upperCaseNames.forEach(System.out::println);
    }
}
