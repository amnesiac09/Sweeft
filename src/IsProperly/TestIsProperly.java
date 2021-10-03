package IsProperly;

import junit.framework.TestCase;

public class TestIsProperly extends TestCase {

    public void test() {
        IsProperly ip = new IsProperly();
        assertTrue(ip.isProperly("()()"));
        assertTrue(ip.isProperly("(()(()))"));
        assertFalse(ip.isProperly(")"));
        assertFalse(ip.isProperly("()())"));
        assertFalse(ip.isProperly("())("));
    }
}
