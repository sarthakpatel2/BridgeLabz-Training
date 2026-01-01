class Patient{
    //static variables
    static String hospitalName="Hawkins City Hospital";
    static int totalPatient=0;
    //instance variables
    String name;
    int age;
    String ailment;
    //final variable
    final String patientID;
    //constructor
    Patient(String patientID,String name,int age, String ailment) {
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        // count patients
        totalPatient++;
    }
    //static method to display total patients
    static void getTotalPatient(){
        System.out.println("Total Patients Admitted: "+totalPatient);
    }
    //display patient details using instanceof
    static void displayPatientDetail(Object obj){
        if (obj instanceof Patient) {
            Patient p=(Patient) obj;
            System.out.println("Hospital Name: "+hospitalName);
            System.out.println("Patient ID: "+p.patientID);
            System.out.println("Name: "+p.name);
            System.out.println("Age: "+p.age);
            System.out.println("Ailment: "+p.ailment);
            System.out.println();
        }
    }
    public static void main(String[] args){
        Patient p1 = new Patient("001", "Vecna",39, "Head Chopped Off");
        Patient p2 = new Patient("008", "Kali",21, "Bullet Shot");
        //display total patient
        getTotalPatient();
        //display patient detail
        displayPatientDetail(p1);
        displayPatientDetail(p2);
    }
}