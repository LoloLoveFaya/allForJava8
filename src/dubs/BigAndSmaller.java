package dubs;

public class BigAndSmaller {

    private int smaller = Integer.MAX_VALUE;
    private int bigger = Integer.MIN_VALUE;

    public void find(int[] numbers) {
        if (numbers.length > 0) {
            for (int n : numbers) {
                if (n > bigger) bigger = n;
                if (n < smaller) smaller = n;
            }
        }
    }

    public int getSmaller() {
        return smaller;
    }

    public int getBigger() {
        return bigger;
    }
}
