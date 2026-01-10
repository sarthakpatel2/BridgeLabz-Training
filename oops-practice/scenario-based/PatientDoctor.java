import java.util.*;
interface IPayable{
    double calculateBill();
}
abstract class Patient implements IPayable{
    private int patientId;
    private String name;
    private int age;
    private Doctor doctor;
    public Patient(int patientId,String name,int age,Doctor doctor){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.doctor=doctor;
    }
    //getters & setters
    public int getPatientId(){
        return patientId; 
        
    }
    public String getName(){
        return name; 
        
    }
    public int getAge(){ 
        return age; 
        
    }
    public Doctor getDoctor(){ 
        return doctor;
        
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age=age;
        
    }
    //polymorphic 
    public abstract void displayInfo();
}
class InPatient extends Patient{
    private int daysAdmitted;
    private double dailyCharge;
    public InPatient(int id,String name,int age,Doctor doctor,int daysAdmitted,double dailyCharge){
        super(id,name,age,doctor);
        this.daysAdmitted=daysAdmitted;
        this.dailyCharge=dailyCharge;
    }
    @Override
    public double calculateBill(){
        return daysAdmitted*dailyCharge;
    }
    @Override
    public void displayInfo() {
        System.out.println("InPatient | ID: "+getPatientId()
            +", Name: "+getName()+", Days: "+daysAdmitted+", Bill: "+calculateBill());
    }
}
class OutPatient extends Patient{
    private double consultationFee;
    public OutPatient(int id, String name, int age, Doctor doctor,double consultationFee){
        super(id, name, age, doctor);
        this.consultationFee=consultationFee;
    }
    @Override
    public double calculateBill(){
        return consultationFee;
    }
    @Override
    public void displayInfo(){
        System.out.println("OutPatient | ID: "+getPatientId()+", Name: "+getName()+", Fee: "+calculateBill());
    }
}
class Doctor{
    private int doctorId;
    private String name;
    private String specialization;
    public Doctor(int doctorId, String name,String specialization){
        this.doctorId=doctorId;
        this.name=name;
        this.specialization=specialization;
    }
    public String getName(){
        return name;
    }
}
class Bill{
    public static void generateBill(Patient patient){
        System.out.println("Total Bill for "+patient.getName()+": "+patient.calculateBill());
    }
}
public class PatientDoctor{
    static List<Patient> patients=new ArrayList<>();
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        Doctor doctor =new Doctor(1, "Dr. Verma", "Neurologist");
        while (true){
            System.out.println("\n1.Add \n2.View \n3.Update \n4.Delete \n5.Exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1->addPatient(doctor);
                case 2 ->viewPatients();
                case 3->updatePatient();
                case 4-> deletePatient();
                case 5-> System.exit(0);
            }
        }
    }
    //create patient
    static void addPatient(Doctor doctor){
        System.out.println("1.InPatient  \n2.OutPatient");
        int type = sc.nextInt();
        System.out.print("ID Name Age: ");
        int id =sc.nextInt();
        String name=sc.next();
        int age=sc.nextInt();
        if (type==1){
            System.out.print("Days Admitted & Daily Charge: ");
            int days=sc.nextInt();
            double charge=sc.nextDouble();
            patients.add(new InPatient(id, name,age,doctor, days,charge));
        }else{
            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            patients.add(new OutPatient(id, name,age, doctor,fee));
        }
    }
    //view patient
    static void viewPatients(){
        for (Patient p:patients){
            p.displayInfo();//polymorphism
            Bill.generateBill(p);
        }
    }
    //update patient
    static void updatePatient(){
        System.out.print("Enter Patient ID: ");
        int id =sc.nextInt();
        for (Patient p:patients){
            if (p.getPatientId()==id){
                System.out.print("Name and Age: ");
                p.setName(sc.next());
                p.setAge(sc.nextInt());
                return;
            }
        }
        System.out.println("Patient Not Found");
    }
    //delete patient 
    static void deletePatient(){
        System.out.print("Enter Patient ID: ");
        int id=sc.nextInt();
        patients.removeIf(p->p.getPatientId()==id);
    }
}