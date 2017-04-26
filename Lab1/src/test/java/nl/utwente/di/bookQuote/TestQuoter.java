package nl.utwente.di.bookQuote;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by claudia.reuvers on 25/04/2017.
 */
public class TestQuoter {

    @Test
    public void testBook1() throws Exception {
        Quoter quoter = new Quoter();
        double price = quoter.getBookPrice("1");
        Assert.assertEquals("Price of book 1", 10.0, price, 0.0);
        Assert.assertEquals("Price of book 2", 45.0, quoter.getBookPrice("2"), 0.0);
        Assert.assertEquals("Price of book 3", 20.0, quoter.getBookPrice("3"), 0.0);
        Assert.assertEquals("Price of book 4", 35.0, quoter.getBookPrice("4"), 0.0);
        Assert.assertEquals("Price of book 5", 50.0, quoter.getBookPrice("5"), 0.0);
        Assert.assertEquals("Price of unknown book", 0.0, quoter.getBookPrice("6"), 0.0);
    }

}
