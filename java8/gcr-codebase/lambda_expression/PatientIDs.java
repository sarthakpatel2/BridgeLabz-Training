import java.util.Arrays;
import java.util.List;
public class PatientIDs{
    public static void main(String[] args){
        //list of Patient IDs
        List<Integer> patientIds=Arrays.asList(101,102,103,104,105,106,107);
        System.out.println("Patient IDs:");
        //using method reference
        patientIds.forEach(System.out::println);
    }
}
