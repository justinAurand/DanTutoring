import java.util.ArrayList;

public class Price {
    private float assemblyCost = 10.00f;
    private FrameService frameService = new FrameService();
    private GlassService glassService = new GlassService();

    public float determine(
        float unitHeight,
        float unitWidth,
        FrameStyle frameStyle,
        FrameWidth frameWidth,
        GlassType glassType
    ) {
        Frame frame = frameService.getByStyle(frameStyle);
        Glass glass = glassService.getByType(glassType);

        float framePricePerInch = frameService.getPricePerInch(frame, frameWidth);
        float framePrice = (unitHeight * 2 + unitWidth * 2) * framePricePerInch;
        float glassPrice = unitHeight * unitWidth * glass.getPricePerSquareInch();
        float price = framePrice + glassPrice + assemblyCost;

        return price;
    }
}
