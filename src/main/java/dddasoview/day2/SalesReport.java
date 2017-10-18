package dddasoview.day2;

import java.util.List;
import java.util.Optional;

/**
 * 売上レポート
 */
public class SalesReport {
    public static SalesReport of(List<CategorizedSalesReport> salesReports) {
        return new SalesReport(salesReports);
    }

    private List<CategorizedSalesReport> categorizedSalesReports;
    private SalesReport(List<CategorizedSalesReport> categorizedSalesReports) {
        this.categorizedSalesReports = categorizedSalesReports;
    }

    public List<CategorizedSalesReport> getCategorizedSalesReports() {
        return categorizedSalesReports;
    }

    public Optional<CategorizedSalesReport> findByCategory(Category category) {
        return this.categorizedSalesReports.stream()
                .filter(categorizedSalesReport -> categorizedSalesReport.getCategory().equals(category))
                .findFirst();
    }
}
