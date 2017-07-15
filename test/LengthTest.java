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
}