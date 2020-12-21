import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Pricer pricer = new Pricer();
        float price = pricer.determinePrice(
            1,
            1,
            FrameStyle.Modern,
            FrameWidth.OneInch,
            GlassType.Antiglare
        );
    }
}
