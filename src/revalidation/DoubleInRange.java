package revalidation;

/**
 * Created by lloyd on 11/30/16.
 */
public class DoubleInRange implements Validation {
    private final double min;
    private final double max;

    public DoubleInRange(double min, double max) {
        this.min = min;
        this.max = max;

    }
    @Override
    public boolean isValid(Object value) {
        if (!(value instanceof Double)) {
            return false;
        }
        return min < (double) value && (double) value < max;
    }

    @Override
    public String errorMessage() {
        return "Number must be between " + min + " and " + max;
    }
}
