/**
 * Created by lloyd on 11/21/16.
 */
public enum DiscountColor {
    RED(0.0), BLUE(0.1), YELLOW(0.25), GREEN(.35), PURPLE(.5), PINK(1.0);

    private final double discount;

    DiscountColor(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double payment) {
        double totalDiscount;
        totalDiscount = payment * this.discount;
        return totalDiscount;
    }
}