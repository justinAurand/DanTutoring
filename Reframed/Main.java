import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Style> styles = new ArrayList<Style>() {
            {
                add(new Style("Chic", 0.10f, 0.18f, 0.25f, 0.32f));
                add(new Style("Deco", 0.12f, 0.20f, 0.28f, 0.35f));
                add(new Style("Modern", 0.13f, 0.25f, 0.33f, 0.45f));
                add(new Style("Chic", 0.15f, 0.28f, 0.40f, 0.47f));
                add(new Style("Chic", 0.16f, 0.30f, 0.45f, 0.50f));
            }
        };
    }
}
