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

    @Test
    public void hasColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasCostPrice() {
        assertEquals(300, guitar.getCostPrice());
    }

    @Test
    public void hasRetailPrice() {
        assertEquals(500, guitar.getRetailPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Kerrang!!!", guitar.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200, guitar.caluculateMarkup());
    }
}
