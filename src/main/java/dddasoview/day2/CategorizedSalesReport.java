package dddasoview.day2;

/**
 * カテゴリ別売上
 */
public class CategorizedSalesReport {
    public static CategorizedSalesReport of(Category category, Quantity quantity, Sales amount) {
        return new CategorizedSalesReport(category, quantity, amount);
    }

    private final Category category;
    private final Quantity quantity;
    private final Sales amount;

    private CategorizedSalesReport(Category category, Quantity quantity, Sales amount) {
        this.category = category;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Sales getAmount() {
        return amount;
    }

    public Price getUnitPrice() {
        return  this.amount.getUnitPrice(this.quantity);
    }
}
