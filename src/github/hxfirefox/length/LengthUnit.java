package github.hxfirefox.length;

public enum LengthUnit {
    BASE(1, "Base"),
    INCH(BASE.getRateOfBase(), "Inch"),
    FEET(12 * INCH.getRateOfBase(), "Feet"),
    YARD(3 * FEET.getRateOfBase(), "Yard"),
    MILE(1760 * YARD.getRateOfBase(), "Mile");
    private int value;
    private String str;

    public int getRateOfBase() {
        return value;
    }

    public String toString() {return str;}

    LengthUnit(int value, String str) {
        this.value = value;
        this.str = str;
    }
}