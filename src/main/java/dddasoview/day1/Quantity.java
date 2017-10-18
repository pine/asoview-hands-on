package dddasoview.day1;

public class Quantity {
    private final int value;

    public static Quantity of(int value) {
        return new Quantity(value);
    }

    private Quantity(int value) {
        if (value < 1) throw new ArithmeticException("`value` should not below 1");
        if (value > 99) throw new ArithmeticException("`value` should not above 99");

        this.value = value;
    }

    /**
     * 加算
     */
    public Quantity add(Quantity rhs) {
        return new Quantity(this.value + rhs.value);
    }

    /**
     * 減算
     */
    public Quantity sub(Quantity rhs) {
        return new Quantity(this.value - rhs.value);
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
