import MusicShop.MusicBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicBookTest {
    MusicBook musicBook;

    @Before
    public void before(){
        musicBook = new MusicBook("Mozart", 10, 30);
    }

    @Test
    public void hasTitle() {
        assertEquals("Mozart", musicBook.getTitle());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10, musicBook.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10, musicBook.getBuyPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(20, musicBook.calculateMarkup());
    }
}
