import java.util.Arrays;
import java.util.List;
public class EventWelcome{
    public static void main(String[] args){
        List<String> attendees =Arrays.asList("Sanjh", "Ayushi", "Akriti");
        attendees.forEach(name->System.out.println("Welcome to the event, "+name));
    }
}
