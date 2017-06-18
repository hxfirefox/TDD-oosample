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
    public void should_compare_between_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(new Yard(1760), new Mile(1));
        assertNotEquals(new Yard(1761), new Mile(1));
        assertEquals(new Yard(1), new Feet(3));
        assertEquals(new Feet(1), new Inch(12));
    }
}