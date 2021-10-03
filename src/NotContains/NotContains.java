package NotContains;

import java.util.Arrays;

public class NotContains {
    public int notContains(int[] array) {
        Arrays.sort(array);
        int comp = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] != comp) return comp;
                else comp++;
            }
        }
        return comp;
    }
}
