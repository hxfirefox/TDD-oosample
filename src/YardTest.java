import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class YardTest {
    @Test
    public void should_yard3_equals_yard3() throws Exception {
        assertEquals(new Yard(3), new Yard(3));
    }

    @Test
    public void should_yard3_not_equals_yard4() throws Exception {
        // given

        // when

        // then
        assertNotEquals(new Yard(3), new Yard(4));
    }

    @Test
    public void should_yard3_equals_yard1_plus_yard2() throws Exception {
        // given

        // when

        // then
        assertEquals(new Yard(3), new Yard(1).add(new Yard(2)));
    }
}
