package github.hxfirefox.format;

import github.hxfirefox.format.Formatter;
import github.hxfirefox.format.GradientFormatter;
import github.hxfirefox.length.Length;
import org.junit.Before;
import org.junit.Test;

import static github.hxfirefox.length.Length.inch;
import static github.hxfirefox.length.Length.mile;
import static org.junit.Assert.*;

public class GradientFormatterTest {
    private Formatter formatter;

    @Before
    public void setUp() throws Exception {
        formatter = new GradientFormatter();
    }

    @Test
    public void should_print_0_inch_when_value_is_0() throws Exception {
        // given

        // when
        // then
        assertEquals("0 Inch", formatter.format(inch(0)));
        assertEquals("0 Inch", formatter.format(mile(0)));
        assertEquals("1 Inch", formatter.format(inch(1)));
    }

    @Test
    public void should_print_1_feet_2_inch_when_14_inch() throws Exception {
        // given

        // when

        // then
        assertEquals("1 Feet 2 Inch", formatter.format(inch(14)));
    }

    @Test
    public void should_print_2_feet_when_24_inch() throws Exception {
        // given

        // when

        // then
        assertEquals("2 Feet", formatter.format(inch(24)));
    }

    @Test
    public void should_print_1_yard_3_inch_when_39_inch() throws Exception {
        // given

        // when

        // then
        assertEquals("1 Yard 3 Inch", formatter.format(inch(39)));
    }

    @Test
    public void should_print_1_mile_2_yard_when_1762_yard() throws Exception {
        // given

        // when

        // then
        assertEquals("1 Mile 2 Yard", formatter.format(Length.yard(1762)));
    }
}