public enum LengthUnit {
    BASE(1),
    INCH(BASE.getRateOfBase()),
    FEET(12 * INCH.getRateOfBase()),
    YARD(3 * FEET.getRateOfBase()),
    MILE(1760 * YARD.getRateOfBase());
    private int value;

    public int getRateOfBase() {
        return value;
    }

    LengthUnit(int value) {
        this.value = value;
    }
}