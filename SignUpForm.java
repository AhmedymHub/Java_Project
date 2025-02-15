import javax.swing.*;
import java.awt.*;

public class SignUpForm extends JFrame {
    
    public SignUpForm() {
        setTitle("Sign up");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(800, 500); // Set the size of the frame
        
        // First section: Membership Enrollment Details
        JPanel membershipPanel = new JPanel(new GridLayout(0, 2));
        membershipPanel.setBorder(BorderFactory.createTitledBorder("Membership Enrollment Details"));
        membershipPanel.setBackground(Color.WHITE);
        
        membershipPanel.add(new JLabel("First Name:"));
        JTextField firstNameField = new JTextField();
        membershipPanel.add(firstNameField);
        
        membershipPanel.add(new JLabel("Middle Name:"));
        JTextField middleNameField = new JTextField();
        membershipPanel.add(middleNameField);
        
        membershipPanel.add(new JLabel("Surname:"));
        JTextField surnameField = new JTextField();
        membershipPanel.add(surnameField);
        
        membershipPanel.add(new JLabel("Date of Birth:"));
        JTextField dobField = new JTextField();
        membershipPanel.add(dobField);

        JComboBox<String> titleComboBox = new JComboBox<>(new String[]{"Mrs", "Ms"}); 
        membershipPanel.add(new JLabel("Title:"));
        membershipPanel.add(titleComboBox);

        JComboBox<String> nationalityComboBox = new JComboBox<>(new String[]{"USA", "UK", "Canada", "France"}); 
        membershipPanel.add(new JLabel("Nationality:"));
        membershipPanel.add(nationalityComboBox);
        
        JComboBox<String> languageComboBox = new JComboBox<>(new String[]{"English", "French", "Spanish", "German"}); 
        membershipPanel.add(new JLabel("Language:"));
        membershipPanel.add(languageComboBox);
        
        add(membershipPanel, BorderLayout.NORTH);
        add(new JSeparator(), BorderLayout.CENTER);
        
        // Second section: Contact Details
        JPanel contactPanel = new JPanel(new GridLayout(0, 2));
        contactPanel.setBorder(BorderFactory.createTitledBorder("Contact Details"));
        contactPanel.setBackground(Color.WHITE);
        
        contactPanel.add(new JLabel("Country/Region:"));
        JComboBox<String> countryComboBox = new JComboBox<>(new String[]{"USA", "UK", "Canada", "France"});
        contactPanel.add(countryComboBox);
        
        contactPanel.add(new JLabel("City:"));
        JComboBox<String> cityComboBox = new JComboBox<>(new String[]{"New York", "London", "Paris", "Toronto"});
        contactPanel.add(cityComboBox);
        
        contactPanel.add(new JLabel("Area Code:"));
        JComboBox<String> areaCodeComboBox = new JComboBox<>(new String[]{"+1", "+44", "+33", "+1"});
        contactPanel.add(areaCodeComboBox);
        
        contactPanel.add(new JLabel("Zip/Postal Code:"));
        JTextField zipCodeField = new JTextField();
        contactPanel.add(zipCodeField);
        
        contactPanel.add(new JLabel("Address:"));
        JTextField addressField = new JTextField();
        contactPanel.add(addressField);
        
        contactPanel.add(new JLabel("Email Address:"));
        JTextField emailField = new JTextField();
        contactPanel.add(emailField);
        
        contactPanel.add(new JLabel("Mobile Number:"));
        JTextField mobileField = new JTextField();
        contactPanel.add(mobileField);
        
        add(contactPanel, BorderLayout.CENTER);
        
        // Third section: Security Details
        JPanel securityPanel = new JPanel(new GridLayout(0, 2));
        securityPanel.setBorder(BorderFactory.createTitledBorder("Security Details"));
        securityPanel.setBackground(Color.WHITE);
        
        JComboBox<String> securityQuestionComboBox = new JComboBox<>(new String[]{"What is your mother's maiden name?", "What is the name of your first pet?", "What is the city of your birth?"}); 
        securityPanel.add(new JLabel("Security Question:"));
        securityPanel.add(securityQuestionComboBox);
        
        securityPanel.add(new JLabel("Create Password:"));
        JPasswordField passwordField = new JPasswordField();
        securityPanel.add(passwordField);
        
        securityPanel.add(new JLabel("Confirm Password:"));
        JPasswordField confirmPasswordField = new JPasswordField();
        securityPanel.add(confirmPasswordField);
        
        securityPanel.add(new JLabel("Answer the Security Question:"));
        JTextField answerField = new JTextField();
        securityPanel.add(answerField);
        
        add(securityPanel, BorderLayout.SOUTH);
        add(new JSeparator(), BorderLayout.CENTER); // Change position to SOUTH

        
             // Fourth section: Information
            //  JPanel infoPanel = new JPanel();
            //  infoPanel.setBorder(BorderFactory.createTitledBorder("Information"));
            //  JLabel infoLabel = new JLabel("<html>To get information about the processing of your personal data within the scope of Miles&Smiles activities please read the Turkish Airlines Privacy Notice for Miles&Smiles and Turkish Airlines GDPR Privacy Notice for Miles&Smiles (if you are subject to GDPR). In addition to the points mentioned in the privacy notices, in some cases you are required to give your explicit consent in order for your personal data to be processed.</html>");
            //  infoPanel.add(infoLabel);
             
            //  add(infoPanel, BorderLayout.SOUTH); // Change position to SOUTH
             
        //      // Fifth section: Policies
        //      JPanel policiesPanel = new JPanel(new GridLayout(0, 1));
        //      policiesPanel.setBorder(BorderFactory.createTitledBorder("Policies"));
             
        //      JCheckBox policyCheckBox1 = new JCheckBox("I accept the General Terms and Conditions of the Miles& Smiles Frequent Flyer Program.");
        //      JCheckBox policyCheckBox2 = new JCheckBox("I hereby agree that Turkish Airlines, Miles&Smiles and Miles&Smiles program partners may send commercial electronic messages such as advertisements, promotions, etc. regarding the products, services and opportunities they offer to the e-mail and phone number I have provided, and that my information, limited to sharing only, may be sent to the third parties providing services.");
        //      JCheckBox policyCheckBox3 = new JCheckBox("I accept my personal data to be used in marketing activities to create and promote products and services specific to me. For more detailed information, please read the Turkish Airlines Miles& Smiles Privacy Notice and Turkish Airlines GDPR Privacy Notice (if you are subject to GDPR).");
             
        //      policiesPanel.add(policyCheckBox1);
        //      policiesPanel.add(policyCheckBox2);
        //      policiesPanel.add(policyCheckBox3);
             
        //      add(policiesPanel, BorderLayout.EAST); // Change position to EAST
             
        //      setLocationRelativeTo(null); // Center the frame
        //  
    }        

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SignUpForm signUpPage = new SignUpForm();
            signUpPage.setVisible(true);
        });
    }
}
