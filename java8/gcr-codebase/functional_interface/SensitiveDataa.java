interface SensitiveData{
   // no methods
}
class PatientRecord implements SensitiveData {
    String patientName;
    String diagnosis;
    PatientRecord(String patientName, String diagnosis){
        this.patientName=patientName;
        this.diagnosis=diagnosis;
    }
}
public class SensitiveDataa{
    public static void main(String[] args){
        PatientRecord record=new PatientRecord("XYZ", "Heart Disease");
        if (record instanceof SensitiveData){
            System.out.println("Encrypting sensitive data before storage");
        } else{
            System.out.println("Storing data normally");
        }
    }
}
