

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MultipleWindowsDemo extends JFrame {
private JTextArea jta;
private JButton jbtShowHistogram = new JButton("Show Histogram");
private Histogram histogram = new Histogram();
// Create a new frame to hold the histogram panel
private JFrame histogramFrame = new JFrame();
public MultipleWindowsDemo() {
// Store text area in a scroll pane
JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
scrollPane.setPreferredSize(new Dimension(300, 200));
jta.setWrapStyleWord(true);
jta.setLineWrap(true);
        add(scrollPane, BorderLayout.CENTER);
                    add(jbtShowHistogram, BorderLayout.SOUTH);
            
            jbtShowHistogram.addActionListener(new ActionListener() {
                @Override 
                public void actionPerformed(ActionEvent e) {
                
                int[] count = countLetters();
               
                histogram.showHistogram(count);
                
                histogramFrame.setVisible(true);
                }
                });
                
                histogramFrame.add(histogram);
                histogramFrame.pack();
                histogramFrame.setTitle("Histogram");
                }
                
                private int[] countLetters() {
                // Count for 26 letters
                int[] count = new int[26];



    


                String text = jta.getText();
                // Count occurrences of each letter (case insensitive)
                for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                if (character >= 'A' && character <= 'Z') {
                count[character - 'A']++;
                }
                else if (character >= 'a' && character <= 'z') {
                count[character - 'a']++;
                }
                }
                return count; // Return the count array
                }
                public static void main(String[] args) {
                MultipleWindowsDemo frame = new MultipleWindowsDemo();
                frame.setLocationRelativeTo(null); // Center the frame
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("MultipleWindowsDemo");
                frame.setSize(800, 800);
                frame.pack();
                frame.setVisible(true);
                }
                }