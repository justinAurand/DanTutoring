import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        float price = new Pricer().determinePrice(
            10,
            10,
            FrameStyle.Classic,
            FrameWidth.OneAndAHalfInches,
            GlassType.Antiglare
        );

        System.out.println(price);
    }
}
