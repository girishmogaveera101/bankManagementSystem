package bank_login.controller;

import bank_login.model.Admin;

public class AdminController {

    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
    }

    public void manageSystem() {
        admin.accessAdminPanel();
    }
}
