public class Yard extends Length{
    private final int amount;

    public Yard(int amount) {
        super(amount, YARD_RATE);
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        Yard other = (Yard) o;
        return this.amount == other.amount;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }

    public Yard add(Yard other) {
        return new Yard(this.amount + other.amount);
    }

    public Feet toFeet() {
        return new Feet(this.amount * YARD_RATE / Length.FEET_RATE);
    }
}
