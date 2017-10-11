package dddasoview.number;

import org.junit.Assert;
import org.junit.Test;

public class QuantityIntegerTest {
    @Test
    public void testOf() {
        Quantity quantity1 = Quantity.of(1);
        Quantity quantity2 = Quantity.of(99);
        Assert.assertEquals(quantity1.valueOf(), 1);
        Assert.assertEquals(quantity2.valueOf(), 99);
    }

    @Test(expected = ArithmeticException.class)
    public void testOf_cannotCreateOf0() {
        Quantity.of(0);
    }

    @Test(expected = ArithmeticException.class)
    public void testOf_cannotCreateOf100() {
        Quantity.of(100);
    }

    @Test
    public void testAdd() {
        Quantity quantity1 = Quantity.of(1);
        Quantity quantity2 = Quantity.of(3);
        Assert.assertEquals(quantity1.add(quantity2).valueOf(), 4);
    }

    @Test
    public void testSub() {
        Quantity quantity1 = Quantity.of(1);
        Quantity quantity2 = Quantity.of(3);
        Assert.assertEquals(quantity2.sub(quantity1).valueOf(), 2);
    }

    @Test
    public void testEquals() {
        Quantity quantity1 = Quantity.of(1);
        Quantity quantity2 = Quantity.of(1);

        Assert.assertNotSame(quantity1, quantity2);
        Assert.assertEquals(quantity1, quantity2);
    }
}
