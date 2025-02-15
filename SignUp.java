import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class SignUp {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("SIGN UP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        frame.setSize(2000, 1000);
        frame.setLayout(new BorderLayout());

        // the general panel
        JPanel generalPanel = new JPanel();
        generalPanel.setLayout(new BoxLayout(generalPanel, BoxLayout.Y_AXIS));
        

        // the first panel (Miles & Smiles Membership Enrollment Details)
        JPanel enrollmentPanel = new JPanel();
        enrollmentPanel.setBackground(Color.WHITE);
        enrollmentPanel.setLayout(new GridLayout(8, 2, 10, 10));
        enrollmentPanel.setBorder(BorderFactory.createTitledBorder("MILES & SMILES MEMBERSHIP ENROLLMENT DETAILS:"));
        enrollmentPanel.add(new JLabel("First / Middle name (as shown on ID):"));
        enrollmentPanel.add(new JTextField(20));
        enrollmentPanel.add(new JLabel("Surname (as shown on ID):"));
        enrollmentPanel.add(new JTextField(20));
        enrollmentPanel.add(new JLabel("Date of Birth (DD/MM/YYYY):"));
        enrollmentPanel.add(new JTextField(20));
        enrollmentPanel.add(new JLabel("Language:"));
        enrollmentPanel.add(new JComboBox<>(new String[]{"Select", "English", "French", "Spanish"}));
        enrollmentPanel.add(new JLabel("Nationality:"));
        enrollmentPanel.add(new JComboBox<>(new String[]{"Select", "American", "Canadian", "Other"}));
        enrollmentPanel.add(new JLabel("Title:"));
        enrollmentPanel.add(new JComboBox<>(new String[]{"Select", "Mr.", "Mrs.", "Ms.", "Dr."}));
        generalPanel.add(enrollmentPanel);
     
        // the second panel (Contact Details)
        JPanel contactPanel = new JPanel();
        contactPanel.setBackground(Color.WHITE);
        contactPanel.setLayout(new GridLayout(8, 2, 10, 10));
        contactPanel.setBorder(BorderFactory.createTitledBorder("CONCTACT DETAILS:"));
        contactPanel.add(new JLabel("Country / Region:"));
        contactPanel.add(new JComboBox<>(new String[]{"Select", "USA", "Canada", "UK"}));
        contactPanel.add(new JLabel("City:"));
        contactPanel.add(new JComboBox<>(new String[]{"Select", "New York", "Los Angeles", "Chicago"}));
        contactPanel.add(new JLabel("Area code:"));
        contactPanel.add(new JComboBox<>(new String[]{"Select", "212", "213", "312"}));
        contactPanel.add(new JLabel("Zip/Postal code:"));
        contactPanel.add(new JTextField(20));
        contactPanel.add(new JLabel("Address:"));
        contactPanel.add(new JTextField(20));
        contactPanel.add(new JLabel("Email Address:"));
        contactPanel.add(new JTextField(20));
        contactPanel.add(new JLabel("Mobile Number:"));
        contactPanel.add(new JTextField(20));
        generalPanel.add(contactPanel);
        

        // the third panel (Security Details)
        JPanel securityPanel = new JPanel();
        securityPanel.setBackground(Color.WHITE);
        securityPanel.setLayout(new GridLayout(4, 2, 10, 10));
        securityPanel.setBorder(BorderFactory.createTitledBorder("SECURITY DETAILS:"));
        securityPanel.add(new JLabel("Create Password:"));
        securityPanel.add(new JPasswordField(20));
        securityPanel.add(new JLabel("Confirm Password:"));
        securityPanel.add(new JPasswordField(20));
        securityPanel.add(new JLabel("Choose a Security Question:"));
        securityPanel.add(new JComboBox<>(new String[]{"Select", "What is your pet's name?", "What is your mother's maiden name?"}));
        securityPanel.add(new JLabel("Answer to Security Question:"));
        securityPanel.add(new JTextField(20));
        generalPanel.add(securityPanel);
       



        JPanel secondGeneralPanel = new JPanel();
        secondGeneralPanel.setLayout(new BoxLayout(secondGeneralPanel, BoxLayout.Y_AXIS));

        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setLayout(new GridLayout(2, 1, 3, 3));
        JLabel infoLabel = new JLabel("<html>To get information about the processing of your personal data within the scope of Miles&Smiles activities please read the Turkish Airlines Privacy Notice for Miles&Smiles and Turkish Airlines GDPR Privacy Notice for Miles&Smiles (if you are subject to GDPR).</html>");
        infoPanel.add(infoLabel);
        infoPanel.add(Box.createVerticalStrut(10));
        secondGeneralPanel.add(infoPanel); 
        secondGeneralPanel.add(infoPanel, BorderLayout.WEST);
        secondGeneralPanel.add(new JSeparator());


        // //for policies

         JPanel consentPanel = new JPanel();
         consentPanel.setBackground(Color.WHITE);
         consentPanel.setLayout(new BoxLayout(consentPanel, BoxLayout.Y_AXIS));
         
         JCheckBox checkBox1 = new JCheckBox("I accept the General Terms and Conditions of the Miles& Smiles Frequent Flyer Program");
         JCheckBox checkBox2 = new JCheckBox("I hereby agree that Turkish Airlines, Miles&Smiles and Miles&Smiles program partners may send commercial electronic messages such as advertisements, promotions, etc. regarding the products, services and opportunities they offer to the e-mail and phone number I have provided, and that my information. limited to sharing only, may be sent to the third parties providing services.");
         JCheckBox checkBox3 = new JCheckBox("I accept my personal data to be used in marketing activities to create and promote products and services specific to me. For more detailed information, please read the Turkish Airlines Miles& Smiles Privacy Notice and Turkish Airlines GDPR Privacy Notice (if you are subject to GDPR).");
         
         // to have red checkmarks
         ItemListener itemListener = new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                 AbstractButton abstractButton = (AbstractButton) e.getSource();
                 ButtonModel buttonModel = abstractButton.getModel();
                 if (buttonModel.isSelected()) {
                     abstractButton.setForeground(Color.RED);
                 } else {
                     abstractButton.setForeground(Color.BLACK);
                 }
             }
         };
 
         checkBox1.addItemListener(itemListener);
         checkBox2.addItemListener(itemListener);
         checkBox3.addItemListener(itemListener);
 
         consentPanel.add(checkBox1);
         consentPanel.add(Box.createVerticalStrut(8));
         consentPanel.add(checkBox2);
         consentPanel.add(Box.createVerticalStrut(2));
         consentPanel.add(checkBox3);
         consentPanel.add(Box.createVerticalStrut(2));
         
         
         secondGeneralPanel.add(consentPanel);
         secondGeneralPanel.add(new JSeparator());  



         JPanel thirdGeneralPanel = new JPanel();
         thirdGeneralPanel.setBackground(Color.WHITE);
         thirdGeneralPanel.setLayout(new BoxLayout(thirdGeneralPanel, BoxLayout.Y_AXIS));
        
         JPanel buttonPanel = new JPanel();
         buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
         JButton submitButton = new JButton("Submit");
         submitButton.setBackground(Color.RED);
         submitButton.setForeground(Color.WHITE);
         submitButton.setFocusable(false);

         submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog when submit button is clicked
                JOptionPane.showMessageDialog(frame, "Congratulations! You have successfully signed up for Miles & Smiles Membership. Welcome aboard!");
            }
        });
        
         buttonPanel.add(submitButton);
         buttonPanel.setBackground(Color.WHITE);
         buttonPanel.setVisible(true);
         thirdGeneralPanel.add(buttonPanel);
         thirdGeneralPanel.add(buttonPanel, BorderLayout.SOUTH);
 

        // adding the general panel to the frame
        frame.add(new JScrollPane(generalPanel), BorderLayout.NORTH);
        frame.add(secondGeneralPanel, BorderLayout.CENTER);
        frame.add(thirdGeneralPanel, BorderLayout.SOUTH);
        // make the frame visible
        frame.setVisible(true);
        
    }

}
        