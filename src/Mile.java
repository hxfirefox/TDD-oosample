public class Mile extends Length{
    private final int amount;

    public Mile(int amount) {
        super(amount, MILE_RATE);
        this.amount = amount;
    }

    public Mile add(Mile other) {
        return new Mile(this.amount + other.amount);
    }

    public Yard toYard() {
        return new Yard(this.amount * Length.MILE_RATE / Length.YARD_RATE);
    }
}
