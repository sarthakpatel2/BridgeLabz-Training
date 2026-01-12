package hospital;

import java.util.*;

public class HospitalServiceImpl implements HospitalService {

    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.name);
    }

    @Override
    public void removePatient(int patientId) {
        patients.removeIf(p -> p.id == patientId);
        System.out.println("Patient removed with ID: " + patientId);
    }

    @Override
    public void bookAppointment(Appointment appointment)
            throws AppointmentNotAvailableException {

        for (Appointment a : appointments) {
            if (a.getDoctor().id == appointment.getDoctor().id &&
                a.getTimeSlot().equals(appointment.getTimeSlot())) {
                throw new AppointmentNotAvailableException(
                        "Doctor not available at this time slot");
            }
        }

        appointments.add(appointment);
        System.out.println("Appointment booked successfully");
        System.out.println("Consultation Fee: ₹" +
                appointment.getDoctor().calculateConsultationFee());
    }

    @Override
    public void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
        System.out.println("Appointment cancelled");
    }
}
