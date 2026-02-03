import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Doctor{
    String name;
    String specialty;
    boolean availableOnWeekend;
    Doctor(String name, String specialty, boolean availableOnWeekend){
        this.name=name;
        this.specialty=specialty;
        this.availableOnWeekend=availableOnWeekend;
    }
    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }
    public String getSpecialty(){
        return specialty;
    }
}
public class HospitalDoctorAvailability{
    public static void main(String[] args){
        List<Doctor> doctors=Arrays.asList(
            new Doctor("Dr. Sanjh", "Cardiology", true),
            new Doctor("Dr. Sarthak", "Neurology", false),
            new Doctor("Dr. Akriti", "Orthopedics", true),
            new Doctor("Dr. Ayushi", "Dermatology", true)
            );

        doctors.stream()
            .filter(Doctor::isAvailableOnWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .forEach(d ->System.out.println(d.name+" - "+d.specialty));
    }
}
