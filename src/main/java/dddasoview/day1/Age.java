package dddasoview.day1;

public class Age {
    private int value;

    public static Age of(long value) {
        if (value > Integer.MAX_VALUE) {
            throw new ArithmeticException("value should be below `Integer.MAX_VALUE`");
        }
        return new Age((int) value);
    }

    private Age(int value) {
        if (value < 0) throw new ArithmeticException("value should be above 0");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
