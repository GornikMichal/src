import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IronArmourTest {

    Item ironArmour;

    @Before
    public void armourCreationWithOnlyArmourPoints(){
        ironArmour = new IronArmour(20);
    }

    @Test
    public void armourCreationWasSuccessful(){
        //then
        assertNotNull(ironArmour);
        assertEquals(20, ironArmour.getPoints());
        assertEquals("Iron Armour", ironArmour.getName());
    }

    @Test
    public void armourCreationWithArmourPointsAndNameSuccesfull(){
        //when
        Item ironArmour2 = new IronArmour("Defener", 30);
        //then
        assertNotNull(ironArmour);
        assertEquals(30, ironArmour2.getPoints());
        assertEquals("Defener", ironArmour2.getName());
    }

    @Test
    public void armourEnchantSuccessful(){
        //when
        ironArmour.enchant(20);
        //then
        assertEquals(40, ironArmour.getPoints());
    }

}
