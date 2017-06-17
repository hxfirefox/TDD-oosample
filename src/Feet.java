public class Feet extends Length{
    private final int amount;

    public Feet(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        Feet other = (Feet) o;
        return this.amount == other.amount;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }

    public Feet add(Feet other) {
        return new Feet(this.amount + other.amount);
    }

    public Inch toInch() {
        return new Inch(this.amount * FEET_RATE / Length.INCH_RATE);
    }
}
