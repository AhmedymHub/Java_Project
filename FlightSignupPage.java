import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlightSignupPage extends JFrame implements ActionListener {
    private JTextField fullNameField, emailField, addressField;
    private JComboBox<String> genderComboBox;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton signupButton;

    public FlightSignupPage() {
        setTitle("Sign Up");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(getForeground());;
        setLayout(new GridLayout(7, 2, 10, 10));

        JLabel fullNameLabel = new JLabel("Full Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");

        

        fullNameField = new JTextField();
        emailField = new JTextField();
        genderComboBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        addressField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();

        signupButton = new JButton("Sign Up");
        signupButton.addActionListener(this);

        add(fullNameLabel);
        add(fullNameField);
        add(emailLabel);
        add(emailField);
        add(genderLabel);
        add(genderComboBox);
        add(addressLabel);
        add(addressField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(new JLabel()); // Empty label for spacing
        add(signupButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signupButton) {
            // Perform signup process here
            String fullName = fullNameField.getText();
            String email = emailField.getText();
            String gender = (String) genderComboBox.getSelectedItem();
            String address = addressField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            // You can implement your signup logic here, like validating inputs, saving to a database, etc.
            // For simplicity, let's just print the entered information
            System.out.println("Full Name: " + fullName);
            System.out.println("Email: " + email);
            System.out.println("Gender: " + gender);
            System.out.println("Address: " + address);
            System.out.println("Password: " + password);
            System.out.println("Confirm Password: " + confirmPassword);

            // You can also close the signup page after successful signup
            // setVisible(false);
            // dispose();
        }
    }

    public static void main(String[] args) {
        new FlightSignupPage();
    }
}
