import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
    public Frame() {
        ArrayList<JPanel> panels = new ArrayList<JPanel>() {
            {
                add(new Height().getPanel());
                add(new Length().getPanel());
                add(new UnitOfMeasurement().getPanel());
                add(new StyleAndWidth().getPanel());
                add(new GlassType().getPanel());
            }
        };

        setLayout(new FlowLayout());

        for (int i = 0; i < panels.size(); i++) {
            add(panels.get(i));
        }

        setSize(400, 400);
    }
}
