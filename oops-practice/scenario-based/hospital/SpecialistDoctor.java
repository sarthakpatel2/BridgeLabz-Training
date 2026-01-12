package hospital;

public class SpecialistDoctor extends Doctor {

    public SpecialistDoctor(int id, String name, String specialization) {
        super(id, name, specialization);
    }

    @Override
    public double calculateConsultationFee() {
        return 1000; // specialist fee
    }
}
