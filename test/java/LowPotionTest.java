import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LowPotionTest {

    Item lowPotion;

    @Before
    public void lowPotionCreation(){
        lowPotion = new LowPotion();
    }

    @Test
    public void lowPotionCreationWasSuccessful(){
        //then
        assertNotNull(lowPotion);
        assertEquals(50, lowPotion.getPoints());
        assertEquals("Low Potion", lowPotion.getName());
        assertEquals(3, lowPotion.getTypeNumber());
    }
}
