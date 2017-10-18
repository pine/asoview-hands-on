package dddasoview.day2;

import org.junit.Assert;
import org.junit.Test;

public class CategoryTest {
    @Test
    public void testGetLabel() {
        Assert.assertEquals(Category.CERAMICS.getLabel(), "陶芸体験");
        Assert.assertEquals(Category.GLASSWORK.getLabel(), "ガラス細工");
        Assert.assertEquals(Category.CANOE_KAYAK.getLabel(), "カヌー・カヤック");
        Assert.assertEquals(Category.PARAGLIDER.getLabel(), "パラグライダー");
    }
}
