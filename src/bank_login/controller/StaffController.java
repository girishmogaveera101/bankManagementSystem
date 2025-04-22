package bank_login.controller;

import bank_login.model.Staff;

public class StaffController {

    private Staff staff;

    public StaffController(Staff staff) {
        this.staff = staff;
    }

    public void handleCustomers() {
        staff.accessStaffPanel();
    }
}
