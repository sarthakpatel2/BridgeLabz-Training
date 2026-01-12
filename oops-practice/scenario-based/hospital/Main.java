package hospital;
public class Main {
    public static void main(String[] args) {
        HospitalService service = new HospitalServiceImpl();
        Patient p1 = new Patient(1, "Sarthak");
        p1.addMedicalRecord("Fever -2026");
        p1.addMedicalRecord("Blood Test - Normal");
        Doctor d1 = new Doctor(101, "Dr. Verma", "General");
        Doctor d2 = new SpecialistDoctor(102, "Dr. Sharma", "Cardiology");
        service.addPatient(p1);
        Appointment a1 = new Appointment(p1, d1, "10:00 AM");
        Appointment a2 = new Appointment(p1, d2, "10:00 AM");
        try {
            service.bookAppointment(a1);
            service.bookAppointment(a2);
        } catch (AppointmentNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        p1.viewMedicalHistory();
        service.cancelAppointment(a1);
        service.removePatient(1);
    }
}
