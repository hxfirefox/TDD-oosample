import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void should_compare_between_same_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(Length.mile(3), Length.mile(3));
        assertEquals(Length.yard(3), Length.yard(3));
        assertEquals(Length.feet(3), Length.feet(3));
        assertEquals(Length.inch(3), Length.inch(3));
    }

    @Test
    public void should_compare_between_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(Length.yard(1760), Length.mile(1));
        assertNotEquals(Length.yard(1761), Length.mile(1));
        assertEquals(Length.yard(1), Length.feet(3));
        assertEquals(Length.feet(1), Length.inch(12));
    }

    @Test
    public void should_add_with_same_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(Length.mile(5), Length.mile(1).add(Length.mile(4)));
        assertEquals(Length.yard(5), Length.yard(1).add(Length.yard(4)));
        assertEquals(Length.feet(5), Length.feet(1).add(Length.feet(4)));
        assertEquals(Length.inch(5), Length.inch(1).add(Length.inch(4)));
    }

    @Test
    public void should_add_with_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(Length.yard(1762), Length.mile(1).add(Length.yard(2)));
        assertEquals(Length.inch(15), Length.feet(1).add(Length.inch(3)));
    }

    @Test
    public void should_print_0_inch_when_value_is_0() throws Exception {
        // given

        // when
        // then
        assertEquals("0 Inch", Length.inch(0).toString());
        assertEquals("0 Inch", Length.mile(0).toString());
        assertEquals("1 Inch", Length.inch(1).toString());
    }

    @Test
    public void should_print_1_feet_2_inch_when_14_inch() throws Exception {
        // given

        // when

        // then
        assertEquals("1 Feet 2 Inch", Length.inch(14).toString());
    }

    @Test
    public void should_print_2_feet_when_24_inch() throws Exception {
        // given

        // when

        // then
        assertEquals("2 Feet", Length.inch(24).toString());
    }

    @Test
    public void should_print_1_yard_3_inch_when_39_inch() throws Exception {
        // given

        // when

        // then
        assertEquals("1 Yard 3 Inch", Length.inch(39).toString());
    }

    @Test
    public void should_print_1_mile_2_yard_when_1762_yard() throws Exception {
        // given

        // when

        // then
        assertEquals("1 Mile 2 Yard", Length.yard(1762).toString());
    }
}