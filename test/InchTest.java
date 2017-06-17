import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InchTest {
    @Test
    public void should_inch3_equals_inch3() throws Exception {
        assertEquals(new Inch(3), new Inch(3));
    }

    @Test
    public void should_inch5_equals_inch1_plus_inch4() throws Exception {
        // given

        // when

        // then
        assertEquals(new Inch(5), new Inch(1).add(new Inch(4)));
    }
}
