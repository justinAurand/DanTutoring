import java.util.ArrayList;

public class GlassService {
    private ArrayList<Glass> glasses = new ArrayList<Glass>() {
        {
            add(new Glass(GlassType.None, 0.00f));
            add(new Glass(GlassType.Normal, 0.22f));
            add(new Glass(GlassType.Antiglare, 0.30f));
            add(new Glass(GlassType.Shatterproof, 0.34f));
        }
    };

    public ArrayList<Glass> getAll() {
        return glasses;
    }

    public Glass getByType(GlassType type) {
        for (int i = 0; i < glasses.size(); i++) {
            Glass glass = glasses.get(i);
            GlassType glassType = glass.getType();

            if (glassType.equals(type)) {
                return glasses.get(i);
            }
        }

        return null;
    }
}
