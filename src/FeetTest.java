import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeetTest {
    @Test
    public void should_feet3_equals_feet3() throws Exception {
        assertEquals(new Feet(3), new Feet(3));
    }

    @Test
    public void should_feet5_equals_feet1_plus_feet4() throws Exception {
        // given

        // when

        // then
        assertEquals(new Feet(5), new Feet(1).add(new Feet(4)));
    }
}
