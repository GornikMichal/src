import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GoblinTest {

    Character goblin;

    @Before
    public void goblinCreationWithoutItems(){
        goblin = new Goblin("Goul");
    }

    @Test
    public void goblinCreationWasSuccessful(){
        //then
        assertNotNull(goblin);
        assertEquals("Goul", goblin.getName());
    }

    @Test
    public void goblinCreationWithWeaponSuccesfull(){
        //given
        Weapon sword = new Sword(20);
        //when
        Character goblin2 = new Goblin("Goul")
                .setWeaponWithCreate(sword);
        //then
        assertNotNull(sword);
        assertNotNull(goblin2);
        assertEquals(20, goblin2.getWeaponStats());
        assertEquals("Sword", goblin2.getWeaponName());
        assertEquals("Goul", goblin2.getName());
    }

    @Test
    public void goblinCreationWithArmourSuccesfull(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        Character goblin2 = new Goblin("Goul")
                .setArmourWithCreate(ironArmour);
        //then
        assertNotNull(ironArmour);
        assertNotNull(goblin2);
        assertEquals(20, goblin2.getArmourStats());
        assertEquals("Iron Armour", goblin2.getArmourName());
        assertEquals("Goul", goblin2.getName());
    }

    @Test
    public void goblinCreationWithWeaponAndArmourSuccesfull(){
        //given
        Weapon sword = new Sword(20);
        Armour ironArmour = new IronArmour(20);
        //when
        Character goblin2 = new Goblin("Goul")
                .setWeaponWithCreate(sword)
                .setArmourWithCreate(ironArmour);
        //then
        assertNotNull(sword);
        assertNotNull(ironArmour);
        assertNotNull(goblin2);
        assertEquals(20, goblin2.getWeaponStats());
        assertEquals("Sword", goblin2.getWeaponName());
        assertEquals(20, goblin2.getArmourStats());
        assertEquals("Iron Armour", goblin2.getArmourName());
        assertEquals("Goul", goblin2.getName());
    }

    @Test
    public void setWeaponAfterCreationGoblin(){
        //given
        Weapon sword = new Sword(20);
        //when
        goblin.setWeapon(sword);
        //then
        assertNotNull(sword);
        assertEquals(20, goblin.getWeaponStats());
        assertEquals("Sword", goblin.getWeaponName());
    }

    @Test
    public void setArmourAfterCreationGoblin(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        goblin.setArmour(ironArmour);
        //then
        assertNotNull(ironArmour);
        assertEquals(20, goblin.getArmourStats());
        assertEquals("Iron Armour", goblin.getArmourName());
    }

    @Test
    public void getGoblinHealthPoints(){
        assertEquals(50, goblin.getHealthPoints());
    }

    @Test
    public void goblinGetDmgAboveMinHealthPoints(){
        //when
        goblin.takeDMG(10);
        //then
        assertEquals(40, goblin.getHealthPoints());
    }

    @Test
    public void goblinGetDmgUnderMinHealthPoints(){
        //when
        goblin.takeDMG(200);
        //then
        assertEquals(0, goblin.getHealthPoints());
    }

    @Test
    public void goblinGetHealthUnderMaxHealthPoints(){
        //when
        goblin.takeDMG(20);
        goblin.heal(10);
        //then
        assertEquals(40, goblin.getHealthPoints());
    }

    @Test
    public void goblinGetHealthAboveMaxHealthPoints(){
        //when
        goblin.heal(10);
        //then
        assertEquals(50, goblin.getHealthPoints());
    }
}

