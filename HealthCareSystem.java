package smartHealthCareSystem;
public class HealthCareSystem {
    
    private Doctor leadDoctor;
    private Patient primaryPatient;

    public HealthcareSystem(String platformName, Doctor doctor, Patient patient) {
        this.platformName = platformName;
        this.leadDoctor = doctor;
        this.primaryPatient = patient;
    }
    public void displaySystemOverview() {

        System.out.println("--- Platform Details ---");

        System.out.println("Healthcare Platform: " + platformName);

        System.out.println("Associated Staff & Patients:");
        leadDoctor.displayInfo();

        primaryPatient.displayInfo();
        System.out.println("-------------------------");
    }
}
