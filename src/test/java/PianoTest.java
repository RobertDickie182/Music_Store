import MusicShop.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Black", "Casio", 500, 800);
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Casio", piano.getManufacturer());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(500, piano.getBuyPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(500, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(800, piano.getSellPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(300, piano.calculateMarkup());
    }
}
