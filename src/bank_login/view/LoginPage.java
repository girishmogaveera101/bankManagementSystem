package bank_login.view;

import javax.swing.*;
import java.awt.*;
import bank_login.controller.LoginController;

public class LoginPage extends JFrame {

    public LoginPage() {
        setTitle("Bank Login System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(40, 44, 52));
        panel.setLayout(new GridLayout(5,1,10,10));

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        usernameField.setBorder(BorderFactory.createTitledBorder("Username"));
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));

        loginButton.setBackground(new Color(0, 172, 193));
        loginButton.setForeground(Color.WHITE);

        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);
        setVisible(true);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            new LoginController
