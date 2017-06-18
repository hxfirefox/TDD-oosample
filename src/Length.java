public class Length {
    private static final int BASE_RATE = 1;
    static final int INCH_RATE = BASE_RATE;
    static final int FEET_RATE = 12 * INCH_RATE;
    static final int YARD_RATE = 3 * FEET_RATE;
    static final int MILE_RATE = 1760 * YARD_RATE;
    private final int amount;
    private final int rateOfBase;

    public Length(int amount, int rateOfBase) {
        this.amount = amount;
        this.rateOfBase = rateOfBase;
    }

    @Override
    public boolean equals(Object o) {
        Length other = (Length) o;
        return amount * rateOfBase == other.amount * other.rateOfBase;
    }
}
