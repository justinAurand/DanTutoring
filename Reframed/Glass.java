public class Glass {
    private GlassType type;
    private float pricePerSquareInch;

    public Glass(GlassType type, float pricePerSquareInch) {
        this.type = type;
        this.pricePerSquareInch = pricePerSquareInch;
    }

    public GlassType getType() {
        return type;
    }

    public float getPricePerSquareInch() {
        return pricePerSquareInch;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(type.name() + ", ");
        builder.append(pricePerSquareInch);

        return builder.toString();
    }
}
