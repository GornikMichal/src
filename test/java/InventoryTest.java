import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InventoryTest {

    Inventory inventory;

    @Before
    public void inventoryCreaction(){
        inventory = new Inventory();
    }

    @Test
    public void InventoryCreationWasSuccesfull(){
        //then
        assertNotNull(inventory);
    }

    @Test
    public void getInventoryQualityIsSuccesfull(){
        //given
        Item sword = new Sword(20);
        //when
        inventory.addItem(sword);
        //then
        assertEquals(1, inventory.getInventorySize());
    }

    @Test
    public void returnAndRemoveItemFromInventoryIsSuccesfull(){
        //given
        Item sword = new Sword(20);
        inventory.addItem(sword);
        //when
        Item givenSword = inventory.returnAndRemoveItem(0);
        //then
        assertNotNull(givenSword);
        assertEquals(sword, givenSword);
        assertEquals(0, inventory.getInventorySize());
    }

    @Test
    public void removeItemFromInventoryIsSuccesfull(){
        //given
        Item sword = new Sword(20);
        inventory.addItem(sword);
        //when
        inventory.returnAndRemoveItem(0);
        //then
        assertEquals(0, inventory.getInventorySize());
    }

    @Test
    public void showInventorySuccesfull(){
        //given
        Item sword = new Sword(20);
        Item armour = new IronArmour(20);
        //when
        inventory.addItem(sword);
        inventory.addItem(armour);
        //then
        inventory.showInventory();
    }

    @Test
    public void returnItemNumberTypeSuccesfull(){
        //given
        Item sword = new Sword(20);
        inventory.addItem(sword);
        //then
        assertEquals(1, inventory.getItemNumberType(0));
    }
}
