import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Footer extends JPanel {
    private static final String URL = "jdbc:sqlite:/home/ahmedym/Desktop/Visual_Project/AirData.db";

    // Method to establish a database connection
    public static Connection connect() {
        Connection conn = null;
        try {
            // Create a connection to the database
            conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public Footer(Main main) {
        setLayout(new BorderLayout());

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
              southPanel.add(new JLabel("From"));
              southPanel.add(new JLabel("To"));
              southPanel.add(new JLabel("Enter Date"));
              southPanel.add(new JLabel("Passengers"));
              southPanel.add(new JLabel()); 
      
              JTextField fromField = new JTextField("Enter departure city", 10);
              fromField.addFocusListener(new FocusAdapter() {
                  @Override
                  public void focusGained(FocusEvent e) {
                      if (fromField.getText().equals("Enter departure city")) {
                          fromField.setText("");
                      }
                  }
  
                public void focusLost(FocusEvent e) {
                    if (fromField.getText().isEmpty()) {
                        fromField.setText("Enter departure city");
                    }
                }
              });
      
              JTextField toField = new JTextField("Enter destination city", 10);
              toField.addFocusListener(new FocusAdapter() {
                  @Override
                  public void focusGained(FocusEvent e) {
                      if (toField.getText().equals("Enter destination city")) {
                          toField.setText("");
                      }
                  }

                  public void focusLost(FocusEvent e) {
                    if (toField.getText().isEmpty()) {
                        toField.setText("Enter destination city");
                    }
                }
              });
      
              JTextField datesField = new JTextField("Enter travel dates: DD/MM/Year ", 10);
              datesField.addFocusListener(new FocusAdapter() {
                  @Override
                  public void focusGained(FocusEvent e) {
                      if (datesField.getText().equals("Enter travel dates: DD/MM/Year ")) {
                          datesField.setText("");
                      }
                  }

                  public void focusLost(FocusEvent e) {
                    if (datesField.getText().isEmpty()) {
                        datesField.setText("Enter travel dates: DD/MM/Year ");
                    }
                }
              });
      
              JTextField passengersField = new JTextField("Enter number of passengers", 10);
              passengersField.addFocusListener(new FocusAdapter() {
                  @Override
                  public void focusGained(FocusEvent e) {
                      if (passengersField.getText().equals("Enter number of passengers")) {
                          passengersField.setText("");
                      }
                  }

                  public void focusLost(FocusEvent e) {
                    if (passengersField.getText().isEmpty()) {
                        passengersField.setText("Enter number of passengers");
                    }
                }
              });
      
              southPanel.add(fromField);
              southPanel.add(toField);
              southPanel.add(datesField);
              southPanel.add(passengersField);

        // Add search button
        JButton searchButton = new JButton("Search");
        searchButton.setBackground(Color.RED);
        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusable(false);
        southPanel.add(searchButton);

        add(southPanel, BorderLayout.SOUTH);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the main method of FlightTicketGUI when search button is clicked
                FlightTicket.main(new String[0]);
            }
        });
        

        
    }
    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Book & Plan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Footer(null));
        frame.pack();
        frame.setVisible(true);
    }
}

