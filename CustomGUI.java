import javax.swing.*;


public class CustomGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Flight Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create the flight information panel
        JPanel flightInfoPanel = new JPanel();
        flightInfoPanel.setBorder(BorderFactory.createTitledBorder("Flight Information"));
        flightInfoPanel.add(new JLabel("23:35 IST Istanbul -> ADD -> JIB Djibouti"));
        flightInfoPanel.add(new JLabel("Flight duration 10h 25m"));
        flightInfoPanel.add(new JLabel("Operated By: Ethiopian Airlines"));

        // Create the economy class panel
        JPanel economyPanel = new JPanel();
        economyPanel.setBorder(BorderFactory.createTitledBorder("Economy"));
        economyPanel.add(new JLabel("Per passenger: TRY 29.882,39"));
        economyPanel.add(new JLabel("4 left at this price"));

        // Create the business class panel
        JPanel businessPanel = new JPanel();
        businessPanel.setBorder(BorderFactory.createTitledBorder("Business"));
        businessPanel.add(new JLabel("Per passenger: TRY 52.330,76"));
        businessPanel.add(new JLabel("2 left at this price"));

        // Add panels to the main panel
        mainPanel.add(flightInfoPanel);
        mainPanel.add(economyPanel);
        mainPanel.add(businessPanel);

        // Add the main panel to the frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
