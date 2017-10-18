package dddasoview.day2;

/**
 * 売上
 */
public class Sales {
    private final int value;

    public static Sales of(int value) {
        return new Sales(value);
    }

    private Sales(int value) {
        this.value = value;
    }

    public int valueOf() {
        return value;
    }

    public Price getUnitPrice(Quantity quantity) {
        return Price.of(this.value * 1000 / quantity.valueOf());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sales sales = (Sales) o;

        return value == sales.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
