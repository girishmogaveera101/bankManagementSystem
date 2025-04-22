package bank_login.model;

public class UserDAO {

    public static User validateUser(String username, String password) {
        if(username.equals("admin") && password.equals("admin123")) {
            return new Admin(username, password);
        } 
        else if(username.equals("staff") && password.equals("staff123")) {
            return new Staff(username, password);
        } 
        else if(username.equals("user") && password.equals("user123")) {
            return new User(username, password, "USER");
        }
        else {
            return null;
        }
    }
}
