public class Frame {
    public String styleName;
    public float halfInchWidthPrice;
    public float oneInchWidthPrice;
    public float oneAndAHalfInchWidthPrice;
    public float twoInchWidthPrice;

    public Frame(
        String styleName,
        float halfInchWidthPrice,
        float oneInchWidthPrice,
        float oneAndAHalfInchWidthPrice,
        float twoInchWidthPrice
    ) {
        this.styleName = styleName;
        this.halfInchWidthPrice = halfInchWidthPrice;
        this.oneInchWidthPrice = oneInchWidthPrice;
        this.oneAndAHalfInchWidthPrice = oneAndAHalfInchWidthPrice;
        this.twoInchWidthPrice = twoInchWidthPrice;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(styleName + ", ");
        builder.append(halfInchWidthPrice + ", ");
        builder.append(oneInchWidthPrice + ", ");
        builder.append(oneAndAHalfInchWidthPrice + ", ");
        builder.append(twoInchWidthPrice);

        return builder.toString();
    }
}
