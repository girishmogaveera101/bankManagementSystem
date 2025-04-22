package bank_login.view;

import javax.swing.*;
import java.awt.*;
import bank_login.model.User;

public class AdminDashboard extends JFrame {

    public AdminDashboard(User admin) {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(33, 150, 243));
        panel.add(new JLabel("Welcome, Admin: " + admin.getUsername()));
        add(panel);

        setVisible(true);
    }
}
