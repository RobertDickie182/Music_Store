import MusicShop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Red", "Fender",6, 300, 500);
    }

    @Test
    public void hasModel() {
        assertEquals("Fender", guitar.getModel());
    }
}
