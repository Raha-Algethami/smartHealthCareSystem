package smartHealthCareSystem;
import smartHealthCareSystem.*;
public class Appointment {
        private int appointmentID;
    private String date;
    private String time;
    private String status;

    private Patient patient;
    private Doctor doctor;

    public Appointment(int id, String date, String time, String status, Patient patient, Doctor doctor) {
        this.appointmentID = id;
        this.date = date;
        this.time = time;
        this.status = status;
        this.patient = patient;
        this.doctor = doctor;
    }
    public void sendReminder() {
        if (status.equals(Status.Confirmed)) {
            System.out.println(
                "Reminder: You have an appointment on " + date +
                " at " + time
            );
        } else {
    
            System.out.println("No reminder: Appointment is not confirmed.");
        }
    }
    public void suggestNewTime() {
        if (status.equals(Status.Cancelled)) {
            System.out.println("Suggested new time: 5:00 PM (After hours clinic)");
        }
    }
}
