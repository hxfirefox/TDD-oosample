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

    public static Length mile(int amount) {
        return new Length(amount, Length.MILE_RATE);
    }

    @Override
    public boolean equals(Object o) {
        Length other = (Length) o;
        return amount * rateOfBase == other.amount * other.rateOfBase;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Length add(Length other) {
        return new Length(amount * rateOfBase + other.amount * other.rateOfBase, BASE_RATE);
    }
}
