import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void should_equals_length_with_corresponding_amount_and_rate() throws Exception {
        assertEquals(new Mile(3), new Length(3, Length.MILE_RATE));
        assertEquals(new Yard(3), new Length(3, Length.YARD_RATE));
        assertEquals(new Feet(3), new Length(3, Length.FEET_RATE));
        assertEquals(new Inch(3), new Length(3, Length.INCH_RATE));
    }

    @Test
    public void should_compare_between_same_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(new Mile(3), new Mile(3));
        assertNotEquals(new Yard(3), new Yard(3));
        assertEquals(new Feet(3), new Feet(3));
        assertEquals(new Inch(3), new Inch(3));
    }

    @Test
    public void should_compare_between_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(new Yard(1760), new Mile(1));
        assertNotEquals(new Yard(1761), new Mile(1));
        assertEquals(new Yard(1), new Feet(3));
        assertEquals(new Feet(1), new Inch(12));
    }

    @Test
    public void should_add_with_same_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(new Mile(5), new Mile(1).add(new Mile(4)));
        assertEquals(new Yard(5), new Yard(1).add(new Yard(4)));
        assertEquals(new Feet(5), new Feet(1).add(new Feet(4)));
        assertEquals(new Inch(5), new Inch(1).add(new Inch(4)));
    }

    @Test
    public void should_add_with_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(new Yard(1762), new Mile(1).add(new Yard(2)));
        assertEquals(new Inch(15), new Feet(1).add(new Inch(3)));
    }
}