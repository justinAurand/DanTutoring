import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Height {
    public JPanel getPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));

        panel.add(new JLabel("Frame Height: "));
        panel.add(new JTextArea(1, 10));

        return panel;
    }
}
