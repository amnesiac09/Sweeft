package IsPalindrome;

import junit.framework.TestCase;

public class TestIsPalindrome extends TestCase {

    public void test1() {
        IsPalindrome ip = new IsPalindrome();
        assertTrue(ip.isPalindrome("abba"));
        assertFalse(ip.isPalindrome("abab"));
        assertTrue(ip.isPalindrome("tattarrattat"));
        assertFalse(ip.isPalindrome("antetokounmpo"));
    }
}
