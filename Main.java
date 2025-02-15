import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame {
    private JPanel contentPanel;
    private JPanel logoPanel;
    private JPanel buttonPanel;
    
    public Main() {
        setTitle("TURKISH AIRLINES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 600);
        setLayout(new BorderLayout());

       /*  // Set the background color to dark blue
        Color darkBlue = new Color(0, 0, 139); 
        getContentPane().setBackground(darkBlue);/* */
        

        
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout()); 
        Footer footer = new Footer(null);
        contentPanel.add(footer, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        add(scrollPane, BorderLayout.CENTER);
        
        JPanel logoAndButtonPanel = new JPanel(new BorderLayout()); 
        Color paneColor = new Color(11, 34, 50); 
        logoAndButtonPanel.setBackground(paneColor);

        // Logo Panel
        logoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        Color darkBlue = new Color(11, 34, 50); 
        logoPanel.setBackground(darkBlue);
        logoPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 200));
        


        //logo image
        ImageIcon logoIcon = new ImageIcon("air.png");
        Image logoImage = logoIcon.getImage();
        Image resizedLogoImage = logoImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        logoIcon = new ImageIcon(resizedLogoImage);
        JLabel logoLabel = new JLabel(logoIcon);
        logoPanel.add(logoLabel);
        JLabel titleLabel = new JLabel("TURKISH AIRLINES");
        titleLabel.setForeground(Color.WHITE);
        logoPanel.add(titleLabel);
        logoAndButtonPanel.add(logoPanel, BorderLayout.WEST);
        


       /* */ // Button Panel
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); 
        Color buttonColor = new Color(11, 34, 50); 
        logoPanel.setBackground(buttonColor);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS)); 
        logoAndButtonPanel.add(buttonPanel, BorderLayout.EAST); 
        Color buttoncolor = new Color(11, 34, 50); 
        buttonPanel.setBackground(buttoncolor);

        add(logoAndButtonPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    public void addButton(String text) {
        JButton button = new JButton(text);
        button.setForeground(Color.WHITE);
        Color buttoncolor = new Color(11, 34, 50); 
        button.setBackground(buttoncolor);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 100));
        button.setBorderPainted(false);



        



            // Add ActionListener to "SIGN UP" button
        if (text.equals("SIGN UP")) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Call the main method of MembershipEnrollmentForm when sign up button is clicked
                    SignUp.main(new String[]{});
                    contentPanel.removeAll();
                    revalidate();
                    repaint();
                    
                    
                }
            });
        }
        else if (text.equals("SIGN IN")) {
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Call the main method of MembershipEnrollmentForm when sign up button is clicked
                    Login.main(new String[]{});
                    revalidate();
                    repaint();
                }
            });
        }
        else if (text.equals("PLAN&BOOK")){
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Call the main method of MembershipEnrollmentForm when sign up button is clicked
                    PlanAndBook.main(new String[]{});
                    revalidate();
                    repaint();
                }
            });
        }
        


        
       

        // i add mouse listener for hover effect
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color buttoncolor = new Color(11, 34, 50); // This represents a dark shade of blue
                button.setBackground(buttoncolor);
            }
        });


        


        buttonPanel.add(button);
    }

    public void addComponent(Component component) {
        contentPanel.add(component, BorderLayout.CENTER); 
        revalidate();
        repaint();
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main();
            frame.addButton("PLAN&BOOK");
            frame.addButton("HELP");
            frame.addButton("SIGN UP");
            frame.addButton("SIGN IN");
            

           
            JPanel imagePanel = new JPanel(new BorderLayout());
            ImageIcon imageIcon = new ImageIcon("istanbul.jpeg");
            JLabel imageLabel = new JLabel(imageIcon);
            imagePanel.add(imageLabel, BorderLayout.NORTH); // i add imageLabel to the CENTER of the panel
            imagePanel.setLayout(null); // i use  null layout for absolute positioning 
            imageLabel.setBounds(10, 10, imageLabel.getPreferredSize().width, imageLabel.getPreferredSize().height); 
            
            frame.addComponent(imagePanel);

      
            



                                    /*ImageIcon imageIcon = new ImageIcon("Galata.jpeg");

                        // Add text to your image using HTML in JLabel
                        JLabel imageLabel = new JLabel("<html><body><img src='" + imageIcon + "'/><br><center>Your Text Here</center></body></html>");

                        // Set the preferred size for the image panel and the image label
                        JPanel imagePanel = new JPanel(new BorderLayout());
                        imagePanel.add(imageLabel, BorderLayout.NORTH); // Add imageLabel to the CENTER of the panel
                        imagePanel.setLayout(null); // Use null layout for absolute positioning 
                        imageLabel.setBounds(10, 10, imageLabel.getPreferredSize().width, imageLabel.getPreferredSize().height); // Set absolute position and size

                        frame.addComponent(imagePanel);
                        */
            
        });
    }
    
}
