package hospital;

public interface HospitalService {

    void addPatient(Patient patient);

    void removePatient(int patientId);

    void bookAppointment(Appointment appointment)
            throws AppointmentNotAvailableException;

    void cancelAppointment(Appointment appointment);
}
