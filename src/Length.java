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

        int temp = toBaseAmount();
        LengthUnit[] units = LengthUnit.values();
        for (int i = 4; i > 0; i--) {
            int v = temp / units[i].getRateOfBase();
            if (v != 0) {
                out.append(startFlag ? " " : "").append(v).append(" ").append(units[i].toString());
                if (!startFlag) {
                    startFlag = true;
                }
            }
            temp = temp % units[i].getRateOfBase();
            if (temp == 0) {
                return out.toString();
            }
        }
        return out.toString();
    }
}
