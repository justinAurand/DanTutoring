public class Frame {
    private String styleName;
    private float halfInchWidthPrice;
    private float oneInchWidthPrice;
    private float oneAndAHalfInchWidthPrice;
    private float twoInchWidthPrice;

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

    public String getStyleName() {
        return styleName;
    }

    public float getHalfInchWidthPrice() {
        return halfInchWidthPrice;
    }

    public float getOneInchWidthPrice() {
        return oneInchWidthPrice;
    }

    public float getOneAndAHalfInchWidthPrice() {
        return oneAndAHalfInchWidthPrice;
    }

    public float getTwoInchWidthPrice() {
        return twoInchWidthPrice;
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
