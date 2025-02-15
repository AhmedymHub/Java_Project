import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonShadowAndLine extends JFrame {

    private JPanel buttonPanel;

    public ButtonShadowAndLine() {
        setTitle("Button Shadow & Line");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Define colors
        Color initialColor = Color.LIGHT_GRAY;
        Color hoverColor = new Color(220, 220, 220); // Lighter shade for hover

        // Create button panel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Adjust spacing as needed

        // Create and add buttons
        for (int i = 0; i < 4; i++) {
            JButton button = new JButton("Button " + (i + 1));
            button.setBackground(initialColor); // Set initial color
            button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding

            // Mouse adapter for hover and exit effects
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(hoverColor);
                    button.setBorder(BorderFactory.createCompoundBorder(
                            BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK), // Bottom shadow
                            BorderFactory.createEmptyBorder(5, 10, 4, 10))); // Adjust padding for shadow
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(initialColor);
                    button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Reset padding
                }
            });

            buttonPanel.add(button);
        }

        add(buttonPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonShadowAndLine();
    }
}
