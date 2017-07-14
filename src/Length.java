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
        return toBaseAmount() == other.toBaseAmount();
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Length add(Length other) {
        return new Length(toBaseAmount() + other.toBaseAmount(), LengthUnit.BASE);
    }

    private int toBaseAmount() {
        return amount * unit.getRateOfBase();
    }

    @Override
    public String toString() {
        if (amount == 0) {
            return "0 Inch";
        }

        int v1 = amount * unit.getRateOfBase() / LengthUnit.FEET.getRateOfBase();
        int v2 = amount * unit.getRateOfBase() % LengthUnit.FEET.getRateOfBase();
        if (v2 == 0) {
            return v1 + " Feet";
        }
        return v1 + " Feet " + v2 + " Inch";
    }
}
