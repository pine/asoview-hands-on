package dddasoview.day2;

import dddasoview.day1.Quantity;

/**
 * 金額
 */
public class Price {
    private final int value;

    public static Price of(int value) {
        return new Price(value);
    }

    private Price(int value) {
        if (value < 0) throw new ArithmeticException("`value` should not below 1");
        this.value = value;
    }

    public int valueOf() {
        return this.value;
    }

    public Price div(Quantity quantity) {
        return Price.of(this.value / quantity.valueOf());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        return value == price.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
