package dddasoview.day2;

/**
 * 個数
 */
public class Quantity {
    private final int value;

    public static Quantity of(int value) {
        return new Quantity(value);
    }

    private Quantity(int value) {
        if (value < 0) throw new ArithmeticException("`value` should not below 1");
        this.value = value;
    }

    public int valueOf() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quantity quantity = (Quantity) o;

        return value == quantity.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
