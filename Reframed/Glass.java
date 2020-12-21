public class Glass {
    private String type;
    private float pricePerSquareInch;

    public Glass(String type, float pricePerSquareInch) {
        this.type = type;
        this.pricePerSquareInch = pricePerSquareInch;
    }

    public String getType() {
        return type;
    }

    public float getPricePerSquareInch() {
        return pricePerSquareInch;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(type + ", ");
        builder.append(pricePerSquareInch);

        return builder.toString();
    }
}
