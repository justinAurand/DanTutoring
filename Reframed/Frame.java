public class Frame {
    private FrameStyle style;
    private float halfInchWidthPricePerInch;
    private float oneInchWidthPricePerInch;
    private float oneAndAHalfInchWidthPricePerInch;
    private float twoInchWidthPricePerInch;

    public Frame(
        FrameStyle style,
        float halfInchWidthPricePerInch,
        float oneInchWidthPricePerInch,
        float oneAndAHalfInchWidthPricePerInch,
        float twoInchWidthPricePerInch
    ) {
        this.style = style;
        this.halfInchWidthPricePerInch = halfInchWidthPricePerInch;
        this.oneInchWidthPricePerInch = oneInchWidthPricePerInch;
        this.oneAndAHalfInchWidthPricePerInch = oneAndAHalfInchWidthPricePerInch;
        this.twoInchWidthPricePerInch = twoInchWidthPricePerInch;
    }

    public FrameStyle getStyle() {
        return style;
    }

    public float getHalfInchWidthPricePerInch() {
        return halfInchWidthPricePerInch;
    }

    public float getOneInchWidthPricePerInch() {
        return oneInchWidthPricePerInch;
    }

    public float getOneAndAHalfInchWidthPricePerInch() {
        return oneAndAHalfInchWidthPricePerInch;
    }

    public float getTwoInchWidthPricePerInch() {
        return twoInchWidthPricePerInch;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(style.name() + ", ");
        builder.append(halfInchWidthPricePerInch + ", ");
        builder.append(oneInchWidthPricePerInch + ", ");
        builder.append(oneAndAHalfInchWidthPricePerInch + ", ");
        builder.append(twoInchWidthPricePerInch);

        return builder.toString();
    }
}
