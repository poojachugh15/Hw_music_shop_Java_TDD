import musicShop.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Golden", "Bb Trumpet", 3, 80, 110);

    }

    @Test
    public void hasColour() {
        assertEquals("Golden", trumpet.getColour());
    }

    @Test
    public void hasModelType() {
        assertEquals("Bb Trumpet", trumpet.getTrumpet());
    }

    @Test
    public void hasNoOfValves() {
        assertEquals(3, trumpet.getNoOfValves());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(80, trumpet.getBoughtPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(110, trumpet.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Peee Pooo" , trumpet.play());
    }

}
