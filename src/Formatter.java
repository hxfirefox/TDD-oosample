public class Formatter {
    private final Length length;

    public Formatter(Length length) {
        this.length = length;
    }

    String format() {
        boolean startFlag = false;
        StringBuilder out = new StringBuilder();
        if (length.getAmount() == 0) {
            return "0 Inch";
        }

        int temp = length.toBaseAmount();
        LengthUnit[] units = LengthUnit.values();
        for (int i = 4; i > 0; i--) {
            int v = temp / units[i].getRateOfBase();
            if (v != 0) {
                out.append(startFlag ? " " : "").append(v).append(" ").append(units[i].toString());
                if (!startFlag) {
                    startFlag = true;
                }
            }
            temp = temp % units[i].getRateOfBase();
            if (temp == 0) {
                return out.toString();
            }
        }
        return out.toString();
    }
}