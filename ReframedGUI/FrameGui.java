import java.awt.*;
import javax.swing.*;

public class FrameGui {
    public static void main(String args[]) {
        FrameGui frameGui = new FrameGui();
    }

    public FrameGui() {
        JFrame frame = getFrame();
        // remote.add(getPowerAndInputPanel(), BorderLayout.NORTH);
        // remote.add(getChannelAndVolumePanel(), BorderLayout.CENTER);
        // remote.add(getDirectionPanel(), BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private JFrame getFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Frame");
        frame.setSize(600, 600);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
