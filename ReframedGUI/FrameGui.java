import javax.swing.JFrame;

public class FrameGui {
    public static void main(String args[]) {
        JFrame frame = new TheFrame();
        frame.setTitle("The Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
