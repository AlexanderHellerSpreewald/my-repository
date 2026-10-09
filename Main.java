/**
 * Main
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Meine App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 180);
            frame.setLocationRelativeTo(null);

            JButton button = new JButton("Klick mich");
            button.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Button wurde geklickt!");
                frame.dispose();
                System.exit(0);
            });

            frame.add(button, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}