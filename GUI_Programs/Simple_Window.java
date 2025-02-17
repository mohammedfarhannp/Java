// Java code for creating a simple window

// Importing classes
import javax.swing.*; // classes for window

// Main class
public class Simple_Window
{
    // Main method of main class
    public static void main(String[] args)
    {
        // Instance of JFrame
        JFrame window = new JFrame("First GUI in Java!"); // window

        // Set Options
        window.setSize(400, 400); // Size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Functionality on Close button click
        window.setLayout(null); // Use null layout for manual placement

        // Adding Button
        JButton button = new JButton("Click Me!"); // Create Button object
        button.setBounds(130, 300, 140, 35); // x y width height
        window.add(button); // Adds button to window

        window.setVisible(true); // Makes the window visible
    }
}
