package bank_login.controller;

import bank_login.model.User;

public class UserController {

    private User user;

    public UserController(User user) {
        this.user = user;
    }

    public void viewProfile() {
        System.out.println("Welcome " + user.getUsername() + "! Your profile is being loaded...");
    }
}
