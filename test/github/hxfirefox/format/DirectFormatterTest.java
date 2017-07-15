package github.hxfirefox.format;

import github.hxfirefox.length.Length;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectFormatterTest {
    private Formatter formatter;

    @Before
    public void setUp() throws Exception {
        formatter = new DirectFormatter();
    }

    @Test
    public void should_print_24_inch_when_2_feet() throws Exception {
        String format = formatter.format(Length.feet(2));
        assertEquals("24 Inch", format);
    }
}
