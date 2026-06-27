package smartHealthCareSystem;
import smartHealthCareSystem.User;
public class Patient extends User {
        private String medicalHistory;

    public Patient(int id, String name, String phoneNumber, String medicalHistory) {
        super(id, name, phoneNumber); 
        this.medicalHistory = medicalHistory;
    }
    @Override
    public void displayInfo() {
        System.out.println(
            "[Patient] ID: " + id +
            " | Name: " + name +
            " | History: " + medicalHistory
        );
    }
}
