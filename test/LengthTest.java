import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void should_mile3_equals_length_with_corresponding_amount_and_rate() throws Exception {
        assertEquals(new Mile(3), new Length(3, Length.MILE_RATE));
    }

    @Test
    public void should_yard3_equals_length_with_corresponding_amount_and_rate() throws Exception {
        assertEquals(new Yard(3), new Length(3, Length.YARD_RATE));
    }
}