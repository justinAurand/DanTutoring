public class MeasurementService {
    private float inchesInACentimeter = 0.3937f;

    public float standardize(float measurement, UnitOfMeasurement unitOfMeasurement) {
        if (unitOfMeasurement.equals(UnitOfMeasurement.Inches)) {
            return measurement;
        }

        return measurement * inchesInACentimeter;
    }
}
