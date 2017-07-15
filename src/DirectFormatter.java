public class DirectFormatter implements Formatter {
    @Override
    public String format(Length length) {
        return length.getAmount() * length.getUnit().getRateOfBase() + " Inch";
    }
}
