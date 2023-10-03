import Behaviours.ISell;
import MusicShop.MusicBook;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell item;

    @Before
    public void before(){
        shop = new Shop("Andy's Music Centre");
        item = new MusicBook("Guitar for dummies", 10, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Andy's Music Centre", shop.getName());
    }

    @Test
    public void stocksStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeFromStock(item);
        assertEquals(0,shop.stockCount());
    }
}
