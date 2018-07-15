import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HammerTest {

    Item hammer;

    @Before
    public void hammerCreationWithOnlyDMGPoints(){
        hammer = new Hammer(20);
    }

    @Test
    public void hammerCreationWasSuccessful(){
        //then
        assertNotNull(hammer);
        assertEquals(20, hammer.getPoints());
        assertEquals("Hammer", hammer.getName());
    }

    @Test
    public void hammerCreationWithArmourPointsAndNameSuccesfull(){
        //when
        Item hammer2 = new Hammer("Lava", 30);
        //then
        assertNotNull(hammer2);
        assertEquals(30, hammer2.getPoints());
        assertEquals("Lava", hammer2.getName());
    }

    @Test
    public void hammerEnchantSuccessful(){
        //when
        hammer.enchant(20);
        //then
        assertEquals(40, hammer.getPoints());
    }
}
