package smartHealthCareSystem;
import smartHealthCareSystem.*;
public class Main {
       public static void main(String[] args) {

        System.out.println("=== Smart Health Platform - Vision 2030 ===\n");

        Doctor dr = new Doctor(1, "Dr. Ahmed", "0501", "Internal Medicine");
        Patient pt1 = new Patient(101, "Salman", "0555", "Flu symptoms");
        Patient pt2 = new Patient(102, "Ali", "0566", "Headache");
        HealthcareSystem v2030Clinic = new HealthcareSystem("Vision 2030 Digital Health Platform", dr, pt1);
      
        v2030Clinic.displaySystemOverview();
        User[] clinicUsers = {dr, pt1, pt2};

        System.out.println("\n--- Polymorphic Display of Clinic Users ---");

        for (int i = 0; i < clinicUsers.length; i++) {
            clinicUsers[i].displayInfo();
        }

        System.out.println("\n--- Appointment Management ---");

        dr.createAppointment(5001, "2026-05-10", "09:00 AM", pt1, Status.Confirmed);

        System.out.println("\n--- Electronic Prescription ---");

        dr.writePrescription(9001, "Aspirin", "100mg", "Once daily", pt1);
        System.out.println("\n--- Billing System ---");

        Calculator bill = new AppointmentFeeCalculator(50.0);

        System.out.println("Total Amount Due: " + bill.calculate() + " SAR");
        
        System.out.println("\n=== Process Completed Successfully ===");
    }
}

