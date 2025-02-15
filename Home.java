import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    public Home() {
        setLayout(new BorderLayout());
        setSize(400, 300);

         // Create an instance of Home
         Home homePanel = new Home();

         // Add Home to the GeneralPanel
         add(homePanel, BorderLayout.SOUTH);

        // North panel with radio buttons
        JPanel northPanel = new JPanel();
        JRadioButton roundTripButton = new JRadioButton("Round trip");
        JRadioButton oneWayButton = new JRadioButton("One way");
        JRadioButton multiCityButton = new JRadioButton("Multi-city");
        ButtonGroup group = new ButtonGroup();
        roundTripButton.setFocusable(false);
        oneWayButton.setFocusable(false);
        multiCityButton.setFocusable(false);
        group.add(roundTripButton);
        group.add(oneWayButton);
        group.add(multiCityButton);
        northPanel.add(roundTripButton);
        northPanel.add(oneWayButton);
        northPanel.add(multiCityButton);
        add(northPanel, BorderLayout.NORTH);

        // South panel with text fields and search button
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2, 5));

        // Add labels
        southPanel.add(new JLabel("From"));
        southPanel.add(new JLabel("To"));
        southPanel.add(new JLabel("Date"));
        southPanel.add(new JLabel("Passengers"));
        southPanel.add(new JLabel()); // Empty label for alignment

        // Add text fields
        JTextField fromField = new JTextField(10);
        JTextField toField = new JTextField(10);
        JTextField datesField = new JTextField(10);
        JTextField passengersField = new JTextField(10);
        southPanel.add(fromField);
        southPanel.add(toField);
        southPanel.add(datesField);
        southPanel.add(passengersField);

        // Add search button
        JButton searchButton = new JButton("Search");
        searchButton.setBackground(Color.RED);
        southPanel.add(searchButton);

        add(southPanel, BorderLayout.SOUTH);
    }
}
