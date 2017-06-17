public class Inch extends Length{
    private final int amount;

    public Inch(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        Inch other = (Inch) o;
        return this.amount == other.amount;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }

    public Inch add(Inch other) {
        return new Inch(this.amount + other.amount);
    }
}
