package MinSplit;

import junit.framework.TestCase;

public class TestMinSplit extends TestCase {

    public void test() {
        MinSplit mp = new MinSplit();
        assertEquals(mp.minSplit(8), 4);
        assertEquals(mp.minSplit(101), 3);
        assertEquals(mp.minSplit(27), 4);
    }
}
