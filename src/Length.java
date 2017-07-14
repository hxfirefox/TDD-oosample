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
        boolean startFlag = false;
        StringBuilder out = new StringBuilder();
        if (amount == 0) {
            return "0 Inch";
        }

        int mileV = amount * unit.getRateOfBase() / LengthUnit.MILE.getRateOfBase();
        if (mileV != 0) {
            out.append(mileV).append(" ").append("Mile");
            startFlag = true;
        }
        int mileV1 = amount * unit.getRateOfBase() % LengthUnit.MILE.getRateOfBase();
        int yardV = mileV1 / LengthUnit.YARD.getRateOfBase();
        if (yardV != 0) {
            out.append(startFlag ? " " : "").append(yardV).append(" ").append("Yard");
            if (!startFlag) {
                startFlag = true;
            }
        }
        int feetV1 = amount * unit.getRateOfBase() % LengthUnit.YARD.getRateOfBase();
        if (feetV1 == 0) {
            return out.toString();
        }
        int feetV = feetV1 / LengthUnit.FEET.getRateOfBase();
        if (feetV != 0) {
            out.append(startFlag ? " " : "").append(feetV).append(" ").append("Feet");
            if (!startFlag) {
                startFlag = true;
            }
        }
        int inchV = feetV1 % LengthUnit.FEET.getRateOfBase();
        if (inchV == 0) {
            return out.toString();
        }
        out.append(startFlag ? " " : "").append(inchV).append(" ").append("Inch");
        return out.toString();
    }
}
