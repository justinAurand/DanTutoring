import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StyleAndWidth {
    public JPanel getPanel() {
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
}
