import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GlassType {
    public JPanel getPanel() {
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
