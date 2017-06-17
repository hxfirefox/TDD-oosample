import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MileTest {
    @Test
    public void should_mile3_equals_mile3() throws Exception {
        assertEquals(new Mile(3), new Mile(3));
    }
}
