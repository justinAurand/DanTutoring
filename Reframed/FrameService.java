import java.util.ArrayList;

public class FrameService {
    private ArrayList<Frame> frames = new ArrayList<Frame>() {
        {
            add(new Frame(FrameStyle.Chic, 0.10f, 0.18f, 0.25f, 0.32f));
            add(new Frame(FrameStyle.Deco, 0.12f, 0.20f, 0.28f, 0.35f));
            add(new Frame(FrameStyle.Modern, 0.13f, 0.25f, 0.33f, 0.45f));
            add(new Frame(FrameStyle.Classic, 0.15f, 0.28f, 0.40f, 0.47f));
            add(new Frame(FrameStyle.Urban, 0.16f, 0.30f, 0.45f, 0.50f));
        }
    };

    public ArrayList<Frame> getAll() {
        return frames;
    }

    public Frame getByStyle(FrameStyle style) {
        for (int i = 0; i < frames.size(); i++) {
            Frame frame = frames.get(i);
            FrameStyle frameStyle = frame.getStyle();

            if (frameStyle.equals(style)) {
                return frames.get(i);
            }
        }

        return null;
    }

    public float getPricePerInch(Frame frame, FrameWidth frameWidth) {
        if (frameWidth.equals(FrameWidth.HalfInch)) {
            return frame.getHalfInchWidthPricePerInch();
        }
        if (frameWidth.equals(FrameWidth.OneInch)) {
            return frame.getOneInchWidthPricePerInch();
        }
        if (frameWidth.equals(FrameWidth.OneAndAHalfInches)) {
            return frame.getOneAndAHalfInchWidthPricePerInch();
        }
        if (frameWidth.equals(FrameWidth.TwoInches)) {
            return frame.getTwoInchWidthPricePerInch();
        }

        return 0.0f;
    }
}
