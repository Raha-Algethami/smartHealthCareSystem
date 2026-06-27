package smartHealthCareSystem;
import smartHealthCareSystem.*;
public class Doctor extends User {
    private String specialization;

    public Doctor(int id, String name, String phoneNumber, String specialization) {
        super(id, name, phoneNumber);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "[Doctor] ID: " + id +
            ", Name: " + name +
            ", Specialization: " + specialization
        );
    }
    public void createAppointment(int id, String date, String time, Patient patient, String initialStatus) {
        Appointment appt = new Appointment(id, date, time, initialStatus, patient, this);

        System.out.println("Success: Appointment " + id + " created.");

        appt.sendReminder();
        appt.suggestNewTime();
    }

    public void writePrescription(int id, String med, String dose, String note, Patient p) {
        Prescription p1 = new Prescription(id, med, dose, note, p, this);
        p1.displayPrescription();
    }
}
