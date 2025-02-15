import javax.swing.*;
import java.awt.*;

public class Login{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Miles & Smiles Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        // Top section with logos
        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        topPanel.setBackground(Color.WHITE);
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        JLabel milesLogo = new JLabel("<html><span style='font-size:14px;font-weight:bold;'>Miles&Smiles</span></html>", JLabel.CENTER);
        JLabel corporateLogo = new JLabel("<html><span style='font-size:14px;font-weight:bold;'>CORPORATE CLUB</span></html>", JLabel.CENTER);

        topPanel.add(milesLogo);
        topPanel.add(corporateLogo);

        // Center section with login form
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        loginPanel.setBackground(Color.WHITE);

        JLabel signInLabel = new JLabel("Sign-in preferences");
        signInLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        signInLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JComboBox<String> signInComboBox = new JComboBox<>(new String[]{"Membership number"});
        signInComboBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, signInComboBox.getMinimumSize().height));

        JTextField membershipField = new JTextField();
        membershipField.setMaximumSize(new Dimension(Integer.MAX_VALUE, membershipField.getMinimumSize().height));
        membershipField.setEnabled(false); // Gray out as in the image

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, passwordField.getMinimumSize().height));

        JCheckBox rememberMeCheckBox = new JCheckBox("Remember me");
        rememberMeCheckBox.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel forgotPasswordLabel = new JLabel("I forgot my password", JLabel.RIGHT);
        forgotPasswordLabel.setForeground(Color.RED);
        forgotPasswordLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

        JButton signInButton = new JButton("Sign in");
        signInButton.setBackground(Color.RED);
        signInButton.setForeground(Color.WHITE);
        signInButton.setFocusable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(signInButton);

        JLabel signUpPromptLabel = new JLabel("Aren't you a member of Miles&Smiles?", JLabel.CENTER);
        signUpPromptLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel signUpLabel = new JLabel("Sign up", JLabel.CENTER);
        signUpLabel.setForeground(Color.RED);
        signUpLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        loginPanel.add(signInLabel);
        loginPanel.add(Box.createVerticalStrut(10));
        loginPanel.add(signInComboBox);
        loginPanel.add(Box.createVerticalStrut(10));
        loginPanel.add(membershipField);
        loginPanel.add(Box.createVerticalStrut(10));
        loginPanel.add(passwordField);
        loginPanel.add(Box.createVerticalStrut(10));
        loginPanel.add(rememberMeCheckBox);
        loginPanel.add(Box.createVerticalStrut(10));
        loginPanel.add(forgotPasswordLabel);
        loginPanel.add(Box.createVerticalStrut(20));
        loginPanel.add(buttonPanel);
        loginPanel.add(Box.createVerticalStrut(20));
        loginPanel.add(signUpPromptLabel);
        loginPanel.add(signUpLabel);



            // // Add ActionListener to "SIGN UP" button
            // if (text.equals("SIGN UP")) {
            //     button.addActionListener(new ActionListener() {
            //         @Override
            //         public void actionPerformed(ActionEvent e) {
            //             // Call the main method of MembershipEnrollmentForm when sign up button is clicked
            //             SignUp.main(new String[]{});
            //             contentPanel.removeAll(); // Remove content panel
            //             revalidate();
            //             repaint();
            //         }
            //     });
            // }

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(loginPanel, BorderLayout.CENTER);

        
        frame.setVisible(true);
    }
}
