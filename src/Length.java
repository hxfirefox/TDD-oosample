public class Length {
    private final int amount;
    private final LengthUnit unit;

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
        return amount * unit.getRateOfBase() == other.amount * other.unit.getRateOfBase();
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Length add(Length other) {
        return new Length(amount * unit.getRateOfBase() + other.amount * other.unit.getRateOfBase(),
                LengthUnit.BASE);
    }
}
