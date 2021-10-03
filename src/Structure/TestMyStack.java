package Structure;

import junit.framework.TestCase;

public class TestMyStack extends TestCase {

    public void test() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertEquals(1, (int)stack.pop());
        stack.push(4);
        stack.push(8);
        assertEquals(8, (int)stack.pop());
        assertEquals(4, (int)stack.pop());
    }

}
