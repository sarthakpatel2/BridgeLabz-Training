package hospital;

public class Doctor extends Person {

    protected String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public double calculateConsultationFee() {
        return 500; // general doctor fee
    }

    public String getSpecialization() {
        return specialization;
    }
}
