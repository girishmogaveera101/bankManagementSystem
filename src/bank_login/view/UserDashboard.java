package bank_login.view;

import javax.swing.*;
import java.awt.*;
import bank_login.model.User;

public class UserDashboard extends JFrame {

    public UserDashboard(User user) {
        setTitle("User Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 193, 7));
        panel.add(new JLabel("Welcome, User: " + user.getUsername()));
        add(panel);

        setVisible(true);
    }
}
