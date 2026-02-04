import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
class Alert{
    String message;
    String type;// either critical, reminder, general
    public Alert(String message, String type){
        this.message=message;
        this.type=type;
    }
    @Override
    public String toString(){
        return type+" Alert: "+message;
    }
}
public class HospitalAlterFiltering{
    public static void main(String[] args){
        List<Alert> alerts=new ArrayList<>();
        alerts.add(new Alert("Heart rate critical", "Critical"));
        alerts.add(new Alert("Take medicines", "Reminder"));
        alerts.add(new Alert("New checkup available", "General"));
        alerts.add(new Alert("Last Stage Cancer", "Critical"));
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Alert Preference:");
        System.out.println("1. Critical Alerts");
        System.out.println("2. Reminder Alerts");
        System.out.println("3. General Alerts");
        int choice=sc.nextInt();
        Predicate<Alert> filter=null;
        switch (choice){
            case 1:
                filter=alert->alert.type.equals("Critical");
                break;
            case 2:
                filter=alert ->alert.type.equals("Reminder");
                break;
            case 3:
                filter=alert ->alert.type.equals("General");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        System.out.println("\nFiltered Alerts:");
        alerts.stream().filter(filter).forEach(System.out::println);
    }
}