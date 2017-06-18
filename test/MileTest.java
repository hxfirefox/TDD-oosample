import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MileTest {
    @Test
    public void should_mile3_equals_mile3() throws Exception {
        assertEquals(new Mile(3), new Mile(3));
    }

    @Test
    public void should_mile3_not_equals_mile2() throws Exception {
        // given

        // when

        // then
        assertNotEquals(new Mile(3), new Mile(2));
    }

    @Test
    public void should_mile5_equals_mile1_plus_mile4() throws Exception {
        // given

        // when

        // then
        assertEquals(new Mile(5), new Mile(1).add(new Mile(4)));
    }

    @Test
    public void should_yard1761_not_equals_mile1() throws Exception {
        // given

        // when

        // then
        assertNotEquals(new Yard(1761), new Mile(1).toYard());
    }

    @Test
    public void should_yard1762_equals_mile1_plus_yard2() throws Exception {
        // given

        // when

        // then
        assertEquals(new Yard(1762), new Mile(1).toYard().add(new Yard(2)));
    }
}
