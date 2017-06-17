import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YardTest {
    @Test
    public void should_yard3_equals_yard3() throws Exception {
        assertEquals(new Yard(3), new Yard(3));
    }
}
