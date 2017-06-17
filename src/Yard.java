public class Yard {
    private final int amount;

    public Yard(int amount) {
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
}
