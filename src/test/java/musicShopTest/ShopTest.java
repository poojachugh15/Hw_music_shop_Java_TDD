package musicShopTest;

import behaviours.ISell;
import musicShop.Guitar;
import musicShop.Shop;
import musicShop.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private ISell item1;
    private ISell item2;

    @Before
    public void setUp() {
        shop = new Shop();
        item1 = new Guitar("Brown", "Acoustic Guitar", 6, 150, 300);
        item2 = new Trumpet("Golden", "Bb Trumpet", 3, 80, 110);

    }

    @Test
    public void hasNoStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemToStock() {
        shop.addStock(item1);
        shop.addStock(item2);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addStock(item1);
        shop.addStock(item2);
        shop.removeStock(item1);
        assertEquals(1, shop.countStock());
    }


}
