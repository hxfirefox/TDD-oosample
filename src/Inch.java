public class Inch extends Length{
    private final int amount;

    public Inch(int amount) {
        super(amount, INCH_RATE);
        this.amount = amount;
    }

//    public Inch add(Inch other) {
//        return new Inch(this.amount + other.amount);
//    }
}
