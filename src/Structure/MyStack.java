package Structure;

public class  MyStack<T> {

    private int count;
    private T arr[];
    private int allocLen;

    public MyStack() {
        this.count = -1;
        this.allocLen = 10;
        this.arr = (T[]) new Object[allocLen];
    }

    public void push(T elem) {
        if (count + 1 == allocLen) grow();
        count++;
        arr[count] = elem;
    }

    public T pop() {
        if (count >= 0) {
            count--;
            return arr[count + 1];
        }
        return null;
    }

    public T front() {
        if (count >= 0) return arr[count];
        return null;
    }

    public boolean isEmpty() {
        return count == -1;
    }

    private void grow() {
        allocLen *= 2;
        T newArr[] = (T[]) new Object[allocLen];
        for (int i = 0; i <= count; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;
    }

}
