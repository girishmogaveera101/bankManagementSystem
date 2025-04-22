package bank_login.model;

public class Staff extends User {

    public Staff(String username, String password) {
        super(username, password, "STAFF");
    }

    public void accessStaffPanel() {
        System.out.println("Staff logged in. Handling bank operations.");
    }
}
