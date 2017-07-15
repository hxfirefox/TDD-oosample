package github.hxfirefox.format;

import org.junit.Test;

import static github.hxfirefox.length.Length.*;
import static org.junit.Assert.assertEquals;

public class FormatterTest {
    @Test
    public void should_print_length_by_inch_when_using_direct_format() throws Exception {
        String format1 = Formatter.directFormatter().format(feet(2));
        String format2 = Formatter.directFormatter().format(yard(2));
        assertEquals("24 Inch", format1);
        assertEquals("72 Inch", format2);
    }

    @Test
    public void should_print_0_inch_when_value_is_0() throws Exception {
        // given

        // when
        Formatter formatter = Formatter.gradientFormatter();
        // then
        assertEquals("0 Inch", formatter.format(inch(0)));
        assertEquals("0 Inch", formatter.format(mile(0)));
        assertEquals("1 Inch", formatter.format(inch(1)));
    }

    @Test
    public void should_print_1_feet_2_inch_when_14_inch() throws Exception {
        // given

        // when
        Formatter formatter = Formatter.gradientFormatter();
        // then
        assertEquals("1 Feet 2 Inch", formatter.format(inch(14)));
    }

    @Test
    public void should_print_2_feet_when_24_inch() throws Exception {
        // given

        // when
        Formatter formatter = Formatter.gradientFormatter();
        // then
        assertEquals("2 Feet", formatter.format(inch(24)));
    }

    @Test
    public void should_print_1_yard_3_inch_when_39_inch() throws Exception {
        // given

        // when
        Formatter formatter = Formatter.gradientFormatter();
        // then
        assertEquals("1 Yard 3 Inch", formatter.format(inch(39)));
    }

    @Test
    public void should_print_1_mile_2_yard_when_1762_yard() throws Exception {
        // given

        // when
        Formatter formatter = Formatter.gradientFormatter();
        // then
        assertEquals("1 Mile 2 Yard", formatter.format(yard(1762)));
    }
}