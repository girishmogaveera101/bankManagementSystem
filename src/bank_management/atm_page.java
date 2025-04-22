package bank_management;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class atm_page {
    private String correctUser = "user";
    private String correctPass = "1234";
    private int balance = 5000;

    public atm_page() {
        // Main ATM Frame
        JFrame atmFrame = new JFrame("ATM Login");

        // Creating UI Components for login
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(20);

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(20);

        JButton loginBtn = new JButton("Login");

        // Layout and positioning with some margin for a more organized UI
        atmFrame.setLayout(new GridLayout(4, 2, 15, 20)); // More space between components
        atmFrame.add(userLabel);
        atmFrame.add(userField);
        atmFrame.add(passLabel);
        atmFrame.add(passField);
        atmFrame.add(new JLabel()); // Empty label for spacing
        atmFrame.add(loginBtn);

        // Setting frame size, layout, and visibility
        atmFrame.setSize(500, 300);  // Increase window size
        atmFrame.setLocationRelativeTo(null); // Center the frame on the screen
        atmFrame.setVisible(true);
        atmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Login button action listener
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = new String(passField.getPassword());

                if (user.equals(correctUser) && pass.equals(correctPass)) {
                    atmFrame.dispose();  // Close login screen
                    showMainMenu();  // Show ATM main menu
                } else {
                    JOptionPane.showMessageDialog(atmFrame, "Login failed!");
                }
            }
        });
    }

    // Function to show the main ATM menu
    private void showMainMenu() {
        JFrame menuFrame = new JFrame("ATM Menu");

        // Creating buttons for menu options
        JButton balanceBtn = new JButton("Balance Enquiry");
        JButton generatePinBtn = new JButton("Generate Pin");
        JButton withdrawBtn = new JButton("Withdraw Cash");

        // Adding Action Listeners to buttons
        balanceBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(menuFrame, "Your balance: ₹" + balance);
            }
        });

        generatePinBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pin = generatePin();
                JOptionPane.showMessageDialog(menuFrame, "Your new PIN: " + pin);
            }
        });

        withdrawBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amountStr = JOptionPane.showInputDialog(menuFrame, "Enter amount to withdraw:");
                try {
                    int amount = Integer.parseInt(amountStr);
                    if (amount <= balance) {
                        balance -= amount;
                        JOptionPane.showMessageDialog(menuFrame, "Withdrawal successful! Remaining balance: ₹" + balance);
                    } else {
                        JOptionPane.showMessageDialog(menuFrame, "Insufficient balance!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(menuFrame, "Invalid amount!");
                }
            }
        });

        // Layout and positioning for ATM menu frame
        menuFrame.setLayout(new GridLayout(4, 1, 15, 20)); // More space between buttons
        menuFrame.add(balanceBtn);
        menuFrame.add(generatePinBtn);
        menuFrame.add(withdrawBtn);

        // Frame settings
        menuFrame.setSize(500, 400);  // Increase window size
        menuFrame.setLocationRelativeTo(null); // Center the frame on the screen
        menuFrame.setVisible(true);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Function to generate a random 4-digit PIN
    private String generatePin() {
        int pin = (int) (Math.random() * 10000);  // Generate a random 4-digit number
        return String.format("%04d", pin);  // Format it to always be 4 digits
    }

    public static void main(String[] args) {
        new atm_page();
    }
}

