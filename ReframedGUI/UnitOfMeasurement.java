import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UnitOfMeasurement {
    public JPanel getPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        panel.add(new JLabel("Unit of Measurement: "));
        panel.add(new JButton("Inches"));
        panel.add(new JButton("Centimeters"));

        return panel;
    }
}
