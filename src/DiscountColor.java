/**
 * Created by lloyd on 11/21/16.
 */
public enum DiscountColor {
    RED(1),
    BLUE(.9),
    YELLOW(.75),
    GREEN(.65),
    PURPLE(.5),
    PINK(0);

    private final double discount;

    DiscountColor(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
