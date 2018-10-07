import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MediumPotionTest {

    Item mediumPotion;

    @Before
    public void lowPotionCreation(){
        mediumPotion = new MediumPotion();
    }

    @Test
    public void lowPotionCreationWasSuccessful(){
        //then
        assertNotNull(mediumPotion);
        assertEquals(100, mediumPotion.getPoints());
        assertEquals("Medium Potion", mediumPotion.getName());
        assertEquals(3, mediumPotion.getTypeNumber());
    }
}
