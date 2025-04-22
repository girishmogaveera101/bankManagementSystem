package bank_login.model;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password, "ADMIN");
    }

    public void accessAdminPanel() {
        System.out.println("Admin logged in. Welcome to the Admin Dashboard!");
    }
}
