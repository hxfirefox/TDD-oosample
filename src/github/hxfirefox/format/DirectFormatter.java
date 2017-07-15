package github.hxfirefox.format;

import github.hxfirefox.length.Length;

public class DirectFormatter implements Formatter {
    @Override
    public String format(Length length) {
        return length.getAmount() * length.getUnit().getRateOfBase() + " Inch";
    }
}
