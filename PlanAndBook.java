import javax.swing.*;
import java.awt.*;

public class PlanAndBook {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("PLAN&BOOK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        // Create the main panel with a GridLayout
        JPanel mainPanel = new JPanel(new GridLayout(1, 3, 20, 0));
        mainPanel.setBackground(new Color(11, 34, 50)); // Dark blue background

        // Create panels for each section
        JPanel bookPanel = createSectionPanel("BOOK", new String[]{
                "Book a flight",
                "Mobile app",
                "Hold the price",
                "TK Wallet"
        });

        JPanel managePanel = createSectionPanel("MANAGE", new String[]{
                "Manage booking",
                "Check-in",
                "Flight status"
        });

        JPanel servicesPanel = createSectionPanel("ADDITIONAL SERVICES", new String[]{
                "Seat selection",
                "Extra baggage",
                "Traveling with pets",
                "Business Upgrade",
                "Sports equipment",
                "Rent a car",
                "Book a hotel",
                "Travel insurance",
                "UAE E-Visa",
                "See all"
        });

        // Add section panels to the main panel
        mainPanel.add(bookPanel);
        mainPanel.add(managePanel);
        mainPanel.add(servicesPanel);

        // Add the main panel to the frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private static JPanel createSectionPanel(String title, String[] items) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(11, 34, 50)); // Dark blue background

        // Corrected font size for the title label
        JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set font size to 16
        titleLabel.setForeground(Color.BLACK); // Text color
        titleLabel.setOpaque(true);
        titleLabel.setBackground(Color.WHITE); // White background
        titleLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, titleLabel.getPreferredSize().height));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Padding around the label
        panel.add(titleLabel);

        // Add item labels to the panel
        for (String item : items) {
            JLabel itemLabel = new JLabel(" • " + item);
            itemLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            itemLabel.setForeground(Color.WHITE);
            itemLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0)); // Added padding
            panel.add(itemLabel);
        }

        return panel;
    }

    public void setVisible(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVisible'");
    }
}
