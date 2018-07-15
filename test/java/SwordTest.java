import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SwordTest {

    Item sword;

    @Before
    public void swordCreationWithOnlyDMGPoints(){
        sword = new Sword(20);
    }

    @Test
    public void swordCreationWasSuccessful(){
        //then
        assertNotNull(sword);
        assertEquals(20, sword.getPoints());
        assertEquals("Sword", sword.getName());
    }

    @Test
    public void swordCreationWithArmourPointsAndNameSuccesfull(){
        //when
        Item sword2 = new Sword("Storm", 30);
        //then
        assertNotNull(sword2);
        assertEquals(30, sword2.getPoints());
        assertEquals("Storm", sword2.getName());
    }

    @Test
    public void swordEnchantSuccessful(){
        //when
        sword.enchant(20);
        //then
        assertEquals(40, sword.getPoints());
    }
}
