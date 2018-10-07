import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HighPotionTest {

    Item highPotion;

    @Before
    public void lowPotionCreation(){
        highPotion = new HighPotion();
    }

    @Test
    public void lowPotionCreationWasSuccessful(){
        //then
        assertNotNull(highPotion);
        assertEquals(200, highPotion.getPoints());
        assertEquals("High Potion", highPotion.getName());
        assertEquals(3, highPotion.getTypeNumber());
    }
}
