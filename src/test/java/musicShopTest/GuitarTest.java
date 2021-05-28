package musicShopTest;

import musicShop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Brown", "Acoustic Guitar", 6, 150, 300  );

    }

    @Test
    public void hasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasModelType() {
        assertEquals("Acoustic Guitar", guitar.getGuitar());
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(150, guitar.getBoughtPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(300, guitar.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Sa Re Ga Ma", guitar.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(150, guitar.calculateMarkup());
    }

}
