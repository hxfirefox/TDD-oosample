import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InchTest {
    @Test
    public void should_inch3_equals_inch3() throws Exception {
        assertEquals(new Inch(3), new Inch(3));
    }
}
