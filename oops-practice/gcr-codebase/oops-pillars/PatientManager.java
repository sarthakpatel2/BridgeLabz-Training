import java.util.*;
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();
    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }
    protected void showMedicalHistory() {
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
    abstract double calculateBill();
    void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Diagnosis : " + diagnosis);
    }
}
class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private double dailyCharge = 2000;
    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
    }
    public double calculateBill() {
        return daysAdmitted *dailyCharge;
    }
    public void addRecord(String record) {
        addMedicalHistory(record);
    }
    public void viewRecords() {
        System.out.println("Medical History:");
        showMedicalHistory();
    }
}
class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee=500;
    public OutPatient(int patientId, String name, int age, String diagnosis) {
        super(patientId, name, age, diagnosis);
    }
    public double calculateBill() {
        return consultationFee;
    }
    public void addRecord(String record) {
        addMedicalHistory(record);
    }
    public void viewRecords() {
        System.out.println("Medical History:");
        showMedicalHistory();
    }
}
public class PatientManager{
    public static void main(String[] args) {
        List<Patient> patientList = new ArrayList<>();
        Patient p1 = new InPatient(101, "Rahul", 35, "Fracture", 5);
        Patient p2 = new OutPatient(102, "Anita", 28, "Fever");
        patientList.add(p1);
        patientList.add(p2);
        // Adding medical records
        ((MedicalRecord) p1).addRecord("X-Ray done");
        ((MedicalRecord) p1).addRecord("Surgery successful");
        ((MedicalRecord) p2).addRecord("Blood test done");
        //polymorphism
        for (Patient patient : patientList){
            System.out.println();
            patient.getPatientDetails();
            System.out.println("Total Bill  : " + patient.calculateBill());
            ((MedicalRecord) patient).viewRecords();
        }
    }
}
