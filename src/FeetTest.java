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

    @Test
    public void should_feet1_equals_inch12() throws Exception {
        // given

        // when

        // then
        assertEquals(new Feet(1).toInch(), new Inch(12));
    }

    @Test
    public void should_inch15_equals_feet1_plus_inch3() throws Exception {
        // given

        // when

        // then
        assertEquals(new Inch(15), new Feet(1).toInch().add(new Inch(3)));
    }
}
