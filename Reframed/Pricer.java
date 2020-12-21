import java.util.ArrayList;

public class Pricer {
    private float assemblyCost = 10.00f;
    private FrameService frameService = new FrameService();
    private GlassService glassService = new GlassService();

    public float determinePrice (
        float unitHeight,
        float unitWidth,
        FrameStyle frameStyle,
        FrameWidth frameWidth,
        GlassType glassType
    ) {
        Frame frame = frameService.getByStyle(frameStyle);
        Glass glass = glassService.getByType(glassType);
        return 0.0f;
    }
}
