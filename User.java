package smartHealthCareSystem;
public class User {
        protected int id;
    protected String name;
    protected String phoneNumber;

    public User(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void login() {
        System.out.println(name + " logged in.");
    }
    public void logout() {
        System.out.println(name + " logged out.");
    }
    public abstract void displayInfo();
}
