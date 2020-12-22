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
        JPanel widthAndStylePanel = getWidthAndStylePanel();
        JPanel glassTypePanel = getGlassTypePanel();

        setLayout(new FlowLayout());
        add(heightPanel);
        add(lengthPanel);
        add(unitOfMeasurementPanel);
        add(widthAndStylePanel);
        add(glassTypePanel);
        setSize(400, 400);
    }

    private JPanel getHeightPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JLabel("Frame Height: "));
        panel.add(new JTextArea(1, 10));
        return panel;
    }

    private JPanel getLengthPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JLabel("Frame Length: "));
        panel.add(new JTextArea(1, 10));
        return panel;
    }

    private JPanel getUnitOfMeasurementPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(new JLabel("Unit of Measurement: "));
        panel.add(new JButton("Inches"));
        panel.add(new JButton("Centimeters"));
        return panel;
    }

    private JPanel getWidthAndStylePanel() {
        JPanel panel = new JPanel(new GridLayout(7,6));
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel("Width"));
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel());
        panel.add(new JLabel("1/2\""));
        panel.add(new JLabel("1\""));
        panel.add(new JLabel("1 1/2\""));
        panel.add(new JLabel("2\""));
        panel.add(new JLabel());
        panel.add(new JLabel("Chic"));
        panel.add(new JButton("0.10"));
        panel.add(new JButton("0.18"));
        panel.add(new JButton("0.25"));
        panel.add(new JButton("0.32"));
        panel.add(new JLabel());
        panel.add(new JLabel("Deco"));
        panel.add(new JButton("0.12"));
        panel.add(new JButton("0.20"));
        panel.add(new JButton("0.28"));
        panel.add(new JButton("0.35"));
        panel.add(new JLabel("Style"));
        panel.add(new JLabel("Modern"));
        panel.add(new JButton("0.13"));
        panel.add(new JButton("0.25"));
        panel.add(new JButton("0.33"));
        panel.add(new JButton("0.45"));
        panel.add(new JLabel());
        panel.add(new JLabel("Classic"));
        panel.add(new JButton("0.15"));
        panel.add(new JButton("0.28"));
        panel.add(new JButton("0.40"));
        panel.add(new JButton("0.47"));
        panel.add(new JLabel());
        panel.add(new JLabel("Urban"));
        panel.add(new JButton("0.16"));
        panel.add(new JButton("0.30"));
        panel.add(new JButton("0.45"));
        panel.add(new JButton("0.50"));
        return panel;
    }

    private JPanel getGlassTypePanel() {
        JPanel panel = new JPanel(new GridLayout(4,2));
        panel.add(new JLabel("Glass Type"));
        panel.add(new JLabel("$ / in\u00B2"));
        panel.add(new JLabel("Normal"));
        panel.add(new JButton("0.22"));
        panel.add(new JLabel("Antiglare"));
        panel.add(new JButton("0.30"));
        panel.add(new JLabel("Shatterproof "));
        panel.add(new JButton("0.34"));
        return panel;
    }
}
