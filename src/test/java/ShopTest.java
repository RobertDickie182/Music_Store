import Behaviours.ISell;
import MusicShop.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell book;
    ISell guitar;
    ISell piano;
    ISell stand;

    @Before
    public void before(){
        shop = new Shop("Andy's Music Centre");
        book = new MusicBook("Guitar for dummies", 10, 15);
        guitar = new Guitar("red","Gibson",6, 300, 500 );
        piano = new Piano("black", "Casio", 800, 1000);
        stand = new MusicStand("silver", 50, 70);
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
        shop.addToStock(book);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.removeFromStock(book);
        assertEquals(0,shop.stockCount());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addToStock(book);
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(stand);
        assertEquals(425, shop.totalPotentialProfit());
    }
}
