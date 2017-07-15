public class Length {
    private final int amount;

    private final LengthUnit unit;
    private Formatter formatter;

    private Length(int amount, LengthUnit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public static Length mile(int amount) {
        return new Length(amount, LengthUnit.MILE);
    }

    public static Length feet(int amount) {
        return new Length(amount, LengthUnit.FEET);
    }

    public static Length inch(int amount) {
        return new Length(amount, LengthUnit.INCH);
    }

    public static Length yard(int amount) {
        return new Length(amount, LengthUnit.YARD);
    }

    @Override
    public boolean equals(Object o) {
        Length other = (Length) o;
        return toBaseAmount() == other.toBaseAmount();
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Length add(Length other) {
        return new Length(toBaseAmount() + other.toBaseAmount(), LengthUnit.BASE);
    }

    public int getAmount() {
        return amount;
    }

    public int toBaseAmount() {
        return amount * unit.getRateOfBase();
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public Length setFormatter(Formatter formatter) {
        this.formatter = formatter;
        return this;
    }

    @Override
    public String toString() {
        return formatter.format(this);
    }
}
