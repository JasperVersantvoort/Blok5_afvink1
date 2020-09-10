import javax.swing.*;
import java.awt.*;

/* FrameDemo.java requires no other files. */
// https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/FrameDemoProject/src/components/FrameDemo.java
public class Opdracht3 {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Opdracht 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("vul in");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        //frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        JLabel label = new JLabel("vul in");
        frame.add(label, BorderLayout.LINE_START);

        JTextField textField = new JTextField("This is a text");
        textField.setColumns(20);
        frame.add(textField, BorderLayout.AFTER_LAST_LINE);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(Opdracht3::createAndShowGUI);
    }
}