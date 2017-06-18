public class Feet extends Length{
    private final int amount;

    public Feet(int amount) {
        super(amount, FEET_RATE);
        this.amount = amount;
    }

//    public Feet add(Feet other) {
//        return new Feet(this.amount + other.amount);
//    }

    public Inch toInch() {
        return new Inch(this.amount * FEET_RATE / Length.INCH_RATE);
    }
}
