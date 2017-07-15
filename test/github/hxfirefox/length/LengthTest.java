package github.hxfirefox.length;

import org.junit.Test;

import static github.hxfirefox.length.Length.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    @Test
    public void should_compare_between_same_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(mile(3), mile(3));
        assertEquals(yard(3), yard(3));
        assertEquals(feet(3), feet(3));
        assertEquals(inch(3), inch(3));
    }

    @Test
    public void should_compare_between_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(yard(1760), mile(1));
        assertNotEquals(yard(1761), mile(1));
        assertEquals(yard(1), feet(3));
        assertEquals(feet(1), inch(12));
    }

    @Test
    public void should_add_with_same_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(mile(5), mile(1).add(mile(4)));
        assertEquals(yard(5), yard(1).add(yard(4)));
        assertEquals(feet(5), feet(1).add(feet(4)));
        assertEquals(inch(5), inch(1).add(inch(4)));
    }

    @Test
    public void should_add_with_different_unit() throws Exception {
        // given

        // when

        // then
        assertEquals(yard(1762), mile(1).add(yard(2)));
        assertEquals(inch(15), feet(1).add(inch(3)));
    }
}