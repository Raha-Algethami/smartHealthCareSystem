package smartHealthCareSystem;
public class Prescription {
      private int prescriptionID;
    private String medicineName;
    private String dosage;
    private String instructions;

    private Patient patient;
    private Doctor doctor;

    public Prescription(int id, String medName, String dose, String instr, Patient p, Doctor d) {
        this.prescriptionID = id;
        this.medicineName = medName;
        this.dosage = dose;
        this.instructions = instr;
        this.patient = p;
        this.doctor = d;
    }
    public void displayPrescription() {

        System.out.println("--- E-Prescription (Vision 2030 Digital Health) ---");

        System.out.println(
            "ID: " + prescriptionID +
            " | Medicine: " + medicineName
        );
     
        System.out.println(
            "Dosage: " + dosage +
            " | Instructions: " + instructions
        );
        System.out.println(
            "Patient: " + patient.name +
            " | Issued by: " + doctor.name
        );
    }
}
