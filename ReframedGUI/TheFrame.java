import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TheFrame extends JFrame {
    public TheFrame() {
        JPanel heightPanel = getHeightPanel();
        JPanel lengthPanel = getLengthPanel();
        JPanel unitOfMeasurementPanel = getUnitOfMeasurementPanel();

        // TODO: Add the Frame Style and Width chart depicted
        // TODO: Add the Glass Type chart depicted (w/ a None row)
        setLayout(new FlowLayout());
        add(heightPanel);
        add(lengthPanel);
        add(unitOfMeasurementPanel);
        setSize(600, 600);
    }

    private JPanel getHeightPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JLabel("Frame Height:"));
        panel.add(new JTextArea(1, 10));
        return panel;
    }

    private JPanel getLengthPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JLabel("Frame Length:"));
        panel.add(new JTextArea(1, 10));
        return panel;
    }

    private JPanel getUnitOfMeasurementPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(new JLabel("Unit of Measurement:"));
        panel.add(new JButton("Inches"));
        panel.add(new JButton("Centimeters"));
        return panel;
    }
}
