import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        // UI supplied values
        float height = 36;
        float length = 72;
        UnitOfMeasurement unitOfMeasurement = UnitOfMeasurement.Centimeters;
        FrameStyle style = FrameStyle.Classic;
        FrameWidth frameWidth = FrameWidth.HalfInch;
        GlassType glassType = GlassType.Antiglare;

        MeasurementService measurementService = new MeasurementService();
        height = measurementService.standardize(height, unitOfMeasurement);
        length = measurementService.standardize(length, unitOfMeasurement);

        float price = new Price().determine(height, length, style, frameWidth, glassType);
        System.out.printf("%.2f", price);
    }
}
