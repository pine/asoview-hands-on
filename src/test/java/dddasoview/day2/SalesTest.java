package dddasoview.day2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SalesTest {
    private SalesReport salesReport;

    @Before
    public void setup() {
        List<CategorizedSalesReport> categorizedSaleReports = Arrays.asList(
                CategorizedSalesReport.of(Category.CERAMICS, Quantity.of(946), Sales.of(4834)),
                CategorizedSalesReport.of(Category.GLASSWORK, Quantity.of(432), Sales.of(2749)),
                CategorizedSalesReport.of(Category.CANOE_KAYAK, Quantity.of(185), Sales.of(2473)),
                CategorizedSalesReport.of(Category.PARAGLIDER, Quantity.of(328), Sales.of(2511))
        );
        this.salesReport = SalesReport.of(categorizedSaleReports);
    }

    @Test
    public void testGetCategorizedSalesReports() {
        List<CategorizedSalesReport> categorizedSalesReports =
                this.salesReport.getCategorizedSalesReports();

        Assert.assertEquals(categorizedSalesReports.get(0).getCategory(), Category.CERAMICS);
        Assert.assertEquals(categorizedSalesReports.get(0).getQuantity(), Quantity.of(946));
        Assert.assertEquals(categorizedSalesReports.get(0).getAmount(), Sales.of(4834));
    }

    @Test
    public void testFindByCategory() {
        Optional<CategorizedSalesReport> categorizedSalesReport =
                this.salesReport.findByCategory(Category.CERAMICS);
        Assert.assertEquals(categorizedSalesReport.isPresent(), true);
        Assert.assertEquals(categorizedSalesReport.get().getCategory(), Category.CERAMICS);
    }
}
