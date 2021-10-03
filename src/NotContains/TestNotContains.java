package NotContains;

import junit.framework.TestCase;

public class TestNotContains extends TestCase {

    public void test() {
        NotContains nc = new NotContains();
        int[] arr1 = {234, 532, 1234, 5324};
        assertEquals(1, nc.notContains(arr1));
        int[] arr2 = {2, 1, 6, 4, 5, 9, 12};
        assertEquals(3, nc.notContains(arr2));
        int[] arr3 = {13, -4, 1, 5, 9, 3};
        assertEquals(2, nc.notContains(arr3));
    }
}
