package github.hxfirefox.format;

import github.hxfirefox.length.Length;
import github.hxfirefox.length.LengthUnit;

@FunctionalInterface
public interface Formatter {
    String format(Length length);

    static Formatter directFormatter() {
        return length -> length.getAmount() * length.getUnit().getRateOfBase() + " Inch";
    }

    static Formatter gradientFormatter() {
        return length -> {
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
        };
    }
}
