package bank_login.view;

import javax.swing.*;
import java.awt.*;
import bank_login.model.User;

public class StaffDashboard extends JFrame {

    public StaffDashboard(User staff) {
        setTitle("Staff Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(76, 175, 80));
        panel.add(new JLabel("Welcome, Staff: " + staff.getUsername()));
        add(panel);

        setVisible(true);
    }
}
