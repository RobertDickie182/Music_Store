import MusicShop.MusicStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {
    MusicStand musicStand;

    @Before
    public void before(){
        musicStand = new MusicStand("Silver", 40, 60);
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", musicStand.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(40, musicStand.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(60, musicStand.getSellPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(20, musicStand.calculateMarkup());
    }
}
