package CountVariants;

import junit.framework.TestCase;

public class TestCountVariants extends TestCase {

    public void test() {
        CountVariants cv = new CountVariants();
        assertEquals(cv.countVariants(4), 5);
        assertEquals(cv.countVariants(7), 21);
        assertEquals(cv.countVariants(24), 75025);
    }
}
