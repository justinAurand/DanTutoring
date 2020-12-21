import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        // UI supplied values
        float height = 12;
        float width = 24;
        UnitOfMeasurement unitOfMeasurement = UnitOfMeasurement.Centimeters;
        FrameStyle style = FrameStyle.Classic;
        FrameWidth frameWidth = FrameWidth.HalfInch;
        GlassType glassType = GlassType.Antiglare;

        MeasurementService measurementService = new MeasurementService();
        height = measurementService.standardize(height, unitOfMeasurement);
        width = measurementService.standardize(width, unitOfMeasurement);

        float price = new Pricer().determinePrice(height, width, style, frameWidth, glassType);
        System.out.printf("%.2f", price);
    }
}
