public class Style {
    public String name;
    public float halfInchWidthPrice;
    public float oneInchWidthPrice;
    public float oneAndAHalfInchWidthPrice;
    public float twoInchWidthPrice;

    public Style(
        String name,
        float halfInchWidthPrice,
        float oneInchWidthPrice,
        float oneAndAHalfInchWidthPrice,
        float twoInchWidthPrice
    ) {
        this.name = name;
        this.halfInchWidthPrice = halfInchWidthPrice;
        this.oneInchWidthPrice = oneInchWidthPrice;
        this.oneAndAHalfInchWidthPrice = oneAndAHalfInchWidthPrice;
        this.twoInchWidthPrice = twoInchWidthPrice;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(name + ", ");
        builder.append(halfInchWidthPrice + ", ");
        builder.append(oneInchWidthPrice + ", ");
        builder.append(oneAndAHalfInchWidthPrice + ", ");
        builder.append(twoInchWidthPrice);

        return builder.toString();
    }
}
