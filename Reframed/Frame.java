public class Frame {
    private String styleName;
    private float halfInchWidthPricePerInch;
    private float oneInchWidthPricePerInch;
    private float oneAndAHalfInchWidthPricePerInch;
    private float twoInchWidthPricePerInch;

    public Frame(
        String styleName,
        float halfInchWidthPricePerInch,
        float oneInchWidthPricePerInch,
        float oneAndAHalfInchWidthPricePerInch,
        float twoInchWidthPricePerInch
    ) {
        this.styleName = styleName;
        this.halfInchWidthPricePerInch = halfInchWidthPricePerInch;
        this.oneInchWidthPricePerInch = oneInchWidthPricePerInch;
        this.oneAndAHalfInchWidthPricePerInch = oneAndAHalfInchWidthPricePerInch;
        this.twoInchWidthPricePerInch = twoInchWidthPricePerInch;
    }

    public String getStyleName() {
        return styleName;
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

        builder.append(styleName + ", ");
        builder.append(halfInchWidthPricePerInch + ", ");
        builder.append(oneInchWidthPricePerInch + ", ");
        builder.append(oneAndAHalfInchWidthPricePerInch + ", ");
        builder.append(twoInchWidthPricePerInch);

        return builder.toString();
    }
}
