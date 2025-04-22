package bank_login.controller;

import bank_login.model.User;
import bank_login.model.UserDAO;
import bank_login.view.*;

public class LoginController {

    public void login(String username, String password) {
        User user = UserDAO.validateUser(username, password);
        
        if(user != null) {
            switch(user.getRole()) {
                case "ADMIN":
                    new AdminDashboard(user).setVisible(true);
                    └─$ touch controller/LoginController.java
                    touch controller/AdminController.java
                    touch controller/StaffController.java
                    touch controller/UserController.java   break;
                case "STAFF":
                    new StaffDashboard(user).setVisible(true);
                    break;
                case "USER":
                    new UserDashboard(user).setVisible(true);
                    break;
                default:
                    System.out.println("Unknown role.");
            }
        } else {
            System.out.println("Invalid credentials! Go touch
