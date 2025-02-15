import javax.swing.*;
import java.awt.*;

public class FlightTicket {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Flight Ticket Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(1200, 800);
        

        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(730, 1)); // Set the preferred height of the separator
        mainPanel.add(separator, BorderLayout.CENTER);
        
        


        JPanel generalPanel = new JPanel(new BorderLayout());
        generalPanel.setPreferredSize(new Dimension(730, 100)); 
        generalPanel.setBackground(Color.WHITE);
        mainPanel.add(generalPanel, BorderLayout.NORTH);


       

        
        JPanel westPanel = new JPanel(new BorderLayout());
        westPanel.setBackground(Color.WHITE);
        westPanel.setBorder(BorderFactory.createEmptyBorder());
       
        generalPanel.add(westPanel, BorderLayout.WEST);

        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.setBackground(Color.WHITE);
        westPanel.add(panel1, BorderLayout.NORTH);

        
        JLabel fromLabel = new JLabel("<html>2:00<br>IST<br>Istanbul</html>", SwingConstants.LEFT);
        fromLabel.setBackground(Color.WHITE);
        JLabel toLabel = new JLabel("<html>1:30<br>AYT<br>Antalya</html>", SwingConstants.RIGHT);
        toLabel.setBackground(Color.WHITE);
        panel1.add(fromLabel, BorderLayout.WEST);
        panel1.add(toLabel, BorderLayout.EAST);

    
        JLabel imageLabel = new JLabel(new ImageIcon("pho.png"));
        imageLabel.setBackground(Color.WHITE);
        panel1.add(imageLabel, BorderLayout.CENTER);

        
        JLabel flightDetailsLabel = new JLabel("Flight duration 1h10m   Aircraft type: Airbus A320 - Narrow-body");
        westPanel.add(flightDetailsLabel, BorderLayout.SOUTH);

        
        JPanel eastPanel = new JPanel(new BorderLayout());
        eastPanel.setBackground(Color.WHITE);
        eastPanel.setBorder(BorderFactory.createEmptyBorder());
        eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.X_AXIS)); 
        generalPanel.add(eastPanel, BorderLayout.EAST);

        JPanel economyPanel = new JPanel(new BorderLayout());
        economyPanel.setBackground(Color.WHITE);
        economyPanel.setBorder(BorderFactory.createTitledBorder("Economy"));
        eastPanel.add(economyPanel, BorderLayout.WEST);

        
        JLabel economyPriceLabel = new JLabel("<html>Price:<br>TRY 3.250,32<br></html>", SwingConstants.CENTER);
        economyPriceLabel.setBackground(Color.WHITE);
        JRadioButton economyRadioButton = new JRadioButton();
        economyRadioButton.setBackground(Color.WHITE);
        economyPanel.add(economyPriceLabel, BorderLayout.CENTER);
        economyPanel.add(economyRadioButton, BorderLayout.WEST);

       
        JPanel businessPanel = new JPanel(new BorderLayout());
        businessPanel.setBackground(Color.WHITE);
        businessPanel.setBorder(BorderFactory.createTitledBorder("Business"));
        eastPanel.add(businessPanel, BorderLayout.EAST);

       
        JLabel businessPriceLabel = new JLabel("<html>Price:<br> TRY 6.621,32<br></html>", SwingConstants.CENTER);
        businessPriceLabel.setBackground(Color.WHITE);
        JRadioButton businessRadioButton = new JRadioButton();
        businessRadioButton.setBackground(Color.WHITE);
        businessPanel.add(businessPriceLabel, BorderLayout.CENTER);
        businessPanel.add(businessRadioButton, BorderLayout.WEST);

           
             ButtonGroup group = new ButtonGroup();
             group.add(economyRadioButton);
             group.add(businessRadioButton);


           
            JPanel secondPanel = new JPanel(new BorderLayout());
            secondPanel.setBackground(Color.WHITE);
            secondPanel.setPreferredSize(new Dimension(730, 100)); 
            mainPanel.add(secondPanel, BorderLayout.SOUTH); 

            JPanel westTicketPanel = new JPanel(new BorderLayout());
            westTicketPanel.setBackground(Color.WHITE);
            westTicketPanel.setBorder(BorderFactory.createEmptyBorder());
            secondPanel.add(westTicketPanel, BorderLayout.WEST);


            JLabel fromIstanbulLabel = new JLabel("<html>10:00<br>IST<br>Istanbul</html>", SwingConstants.LEFT);
            fromIstanbulLabel.setBackground(Color.WHITE);
            JLabel toParisLabel = new JLabel("<html>12:30<br>CDG<br>Paris</html>", SwingConstants.RIGHT);
            toParisLabel.setBackground(Color.WHITE);
            westTicketPanel.add(fromIstanbulLabel, BorderLayout.WEST);
            westTicketPanel.add(toParisLabel, BorderLayout.EAST);

            JLabel ticketImageLabel = new JLabel(new ImageIcon("pho.png"));
            ticketImageLabel.setBackground(Color.WHITE);
            westTicketPanel.add(ticketImageLabel, BorderLayout.CENTER);

            
            JLabel ticketFlightDetailsLabel = new JLabel("Flight duration 2h30m   Aircraft type: Boeing 777 - Wide-body");
            westTicketPanel.add(ticketFlightDetailsLabel, BorderLayout.SOUTH);

            
            JPanel eastTicketPanel = new JPanel(new BorderLayout());
            eastTicketPanel.setLayout(new BoxLayout(eastTicketPanel, BoxLayout.X_AXIS));
            eastTicketPanel.setBackground(Color.WHITE);
            eastTicketPanel.setBorder(BorderFactory.createEmptyBorder());
            secondPanel.add(eastTicketPanel, BorderLayout.EAST);


            // Economy class panel
            JPanel economyTicketPanel = new JPanel(new BorderLayout());
            economyTicketPanel.setBackground(Color.WHITE);
            // Dimension fillerSize = new Dimension(60, 20);
            // eastTicketPanel.add(economyTicketPanel);
            // eastTicketPanel.add(Box.createRigidArea(fillerSize));
            economyTicketPanel.setBorder(BorderFactory.createTitledBorder("Economy"));
            eastTicketPanel.add(economyTicketPanel, BorderLayout.WEST);


            JLabel economyTicketPriceLabel = new JLabel("<html>Price:<br> TRY 4.500,00<br></html>", SwingConstants.CENTER);
            economyTicketPriceLabel.setBackground(Color.WHITE);
            JRadioButton economyTicketRadioButton = new JRadioButton();
            economyTicketRadioButton.setBackground(Color.WHITE);
            economyTicketPanel.add(economyTicketPriceLabel, BorderLayout.CENTER);
            economyTicketPanel.add(economyTicketRadioButton, BorderLayout.WEST);

            JPanel businessTicketPanel = new JPanel(new BorderLayout());
            businessTicketPanel.setBackground(Color.WHITE);
            businessTicketPanel.setBorder(BorderFactory.createTitledBorder("Business"));
            eastTicketPanel.add(businessTicketPanel, BorderLayout.EAST);

            JLabel businessTicketPriceLabel = new JLabel("<html>Price:<br> TRY 9.500,00<br></html>", SwingConstants.CENTER);
            businessTicketPriceLabel.setBackground(Color.WHITE);
            JRadioButton businessTicketRadioButton = new JRadioButton();
            businessTicketRadioButton.setBackground(Color.WHITE);
            businessTicketPanel.add(businessTicketPriceLabel, BorderLayout.CENTER);
            businessTicketPanel.add(businessTicketRadioButton, BorderLayout.WEST);


            ButtonGroup ticketGroup = new ButtonGroup();
            ticketGroup.add(economyTicketRadioButton);
            ticketGroup.add(businessTicketRadioButton);

            
// economyTicketRadioButton.setSelected(true);
       
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void displayGUI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayGUI'");
    }
}
