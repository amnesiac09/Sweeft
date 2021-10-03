package CountVariants;

public class CountVariants {
    private int fibonacci(int num) {
        if (num <= 1) return num;
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public int countVariants(int stairsCount) {
        return fibonacci(stairsCount + 1);
    }
}
