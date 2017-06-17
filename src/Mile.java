public class Mile extends Length{
    private final int amount;

    public Mile(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        Mile other = (Mile) o;
        return this.amount == other.amount;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }

    public Mile add(Mile other) {
        return new Mile(this.amount + other.amount);
    }

    public Yard toYard() {
        return new Yard(this.amount * 1760);
    }
}
