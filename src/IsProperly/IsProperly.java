package IsProperly;

import java.util.Stack;

public class IsProperly {
    public boolean isProperly(String sequence) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}
