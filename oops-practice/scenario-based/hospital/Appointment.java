package hospital;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String timeSlot;

    public Appointment(Patient patient, Doctor doctor, String timeSlot) {
        this.patient = patient;
        this.doctor = doctor;
        this.timeSlot = timeSlot;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Appointment: " + patient.name +
                " with Dr. " + doctor.name +
                " (" + doctor.getSpecialization() + ")" +
                " at " + timeSlot;
    }
}
