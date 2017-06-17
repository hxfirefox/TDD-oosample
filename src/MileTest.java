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
}
