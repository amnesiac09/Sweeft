package MinSplit;

import java.util.ArrayList;
import java.util.List;

public class MinSplit {
    public int minSplit(int amount) {
        int ans = 0;
        List<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(5);
        coins.add(10);
        coins.add(20);
        coins.add(50);
        int index = coins.size() - 1;
        while (amount != 0) {
            if (amount >= coins.get(index)) {
                ans += amount / coins.get(index);
                amount = amount % coins.get(index);
            } else {
                index--;
            }
        }
        return ans;

    }
}
