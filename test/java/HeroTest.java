import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HeroTest {

    Character hero;

    @Before
    public void heroCreation(){
        hero = new Hero();
    }

    @Test
    public void heroCreationWasSuccessful(){
        //then
        assertNotNull(hero);
        assertEquals("Darkan", hero.getName());
    }

    @Test
    public void heroCreationWithWeaponSuccesfull(){
        //given
        Weapon sword = new Sword(20);
        //when
        Character hero2 = new Hero()
                .setWeaponWithCreate(sword);
        //then
        assertNotNull(sword);
        assertNotNull(hero2);
        assertEquals(20, hero2.getWeaponStats());
        assertEquals("Sword", hero2.getWeaponName());
        assertEquals("Darkan", hero2.getName());
    }

    @Test
    public void heroCreationWithArmourSuccesfull(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        Character hero2 = new Hero()
                .setArmourWithCreate(ironArmour);
        //then
        assertNotNull(ironArmour);
        assertNotNull(hero2);
        assertEquals(20, hero2.getArmourStats());
        assertEquals("Iron Armour", hero2.getArmourName());
        assertEquals("Darkan", hero2.getName());
    }

    @Test
    public void heroCreationWithWeaponAndArmourSuccesfull(){
        //given
        Weapon sword = new Sword(20);
        Armour ironArmour = new IronArmour(20);
        //when
        Character hero2 = new Hero()
                .setWeaponWithCreate(sword)
                .setArmourWithCreate(ironArmour);
        //then
        assertNotNull(sword);
        assertNotNull(ironArmour);
        assertNotNull(hero2);
        assertEquals(20, hero2.getWeaponStats());
        assertEquals("Sword", hero2.getWeaponName());
        assertEquals(20, hero2.getArmourStats());
        assertEquals("Iron Armour", hero2.getArmourName());
        assertEquals("Darkan", hero2.getName());
    }

    @Test
    public void setWeaponAfterCreationHero(){
        //given
        Weapon sword = new Sword(20);
        //when
        hero.setWeapon(sword);
        //then
        assertNotNull(sword);
        assertEquals(20, hero.getWeaponStats());
        assertEquals("Sword", hero.getWeaponName());
    }

    @Test
    public void setArmourAfterCreationHero(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        hero.setArmour(ironArmour);
        //then
        assertNotNull(ironArmour);
        assertEquals(20, hero.getArmourStats());
        assertEquals("Iron Armour", hero.getArmourName());
    }

    @Test
    public void getHeroHealthPoints(){
        assertEquals(100, hero.getHealthPoints());
    }

    @Test
    public void heroGetDmgAboveMinHealthPoints(){
        //when
        hero.takeDMG(10);
        //then
        assertEquals(90, hero.getHealthPoints());
    }

    @Test
    public void heroGetDmgUnderMinHealthPoints(){
        //when
        hero.takeDMG(200);
        //then
        assertEquals(0, hero.getHealthPoints());
    }

    @Test
    public void heroGetHealthUnderMaxHealthPoints(){
        //when
        hero.takeDMG(20);
        hero.heal(10);
        //then
        assertEquals(90, hero.getHealthPoints());
    }

    @Test
    public void heroGetHealthAboveMaxHealthPoints(){
        //when
        hero.heal(10);
        //then
        assertEquals(100, hero.getHealthPoints());
    }

    @Test
    public void getInventoryQualityIsSuccesfull(){
        //given
        Item sword = new Sword(20);
        //when
        ((Hero) hero).putItemToInventory(sword);
        //then
        assertEquals(1, ((Hero) hero).getInventorySize());
    }

    @Test
    public void removeItemFromInventoryIsSuccesfull(){
        //given
        Item sword = new Sword(20);
        ((Hero) hero).putItemToInventory(sword);
        //when
        ((Hero) hero).dropItemFromInventory(0);
        //then
        assertEquals(0, ((Hero) hero).getInventorySize());
    }

    @Test
    public void removeItemFromInventoryIsFailed(){
        //given
        Item sword = new Sword(20);
        ((Hero) hero).putItemToInventory(sword);
        //when
        ((Hero) hero).dropItemFromInventory(1);
        //then
        assertEquals(1, ((Hero) hero).getInventorySize());
    }

    @Test
    public void showInventorySuccesfull(){
        //given
        Item sword = new Sword(20);
        Item armour = new IronArmour(20);
        //when
        ((Hero) hero).putItemToInventory(sword);
        //then
        ((Hero) hero).checkInventory();
    }

    @Test
    public void wearWeaponIsSuccesfull(){
        //given
        Item sword = new Sword(20);
        ((Hero) hero).putItemToInventory(sword);
        //when
        ((Hero) hero).wearWeapon(0);
        //then
        assertEquals("Sword", hero.getWeaponName());
        assertEquals(20, hero.getWeaponStats());
    }

    @Test
    public void wearWeaponIsFailedBecauseIsWrongIndex(){
        //given
        Item sword = new Sword(20);
        ((Hero) hero).putItemToInventory(sword);
        //when
        ((Hero) hero).wearWeapon(1);
        //then
        assertEquals("", hero.getWeaponName());
        assertEquals(-1, hero.getWeaponStats());
    }

    @Test
    public void wearWeaponIsFailedBecauseIsWrongItemType(){
        //given
        Item armour = new IronArmour(20);
        ((Hero) hero).putItemToInventory(armour);
        //when
        ((Hero) hero).wearWeapon(0);
        //then
        assertEquals("", hero.getWeaponName());
        assertEquals(-1, hero.getWeaponStats());
    }

    @Test
    public void wearArmourIsSuccesfull(){
        //given
        Item armour = new IronArmour(20);
        ((Hero) hero).putItemToInventory(armour);
        //when
        ((Hero) hero).wearArmour(0);
        //then
        assertEquals("Iron Armour", hero.getArmourName());
        assertEquals(20, hero.getArmourStats());
    }

    @Test
    public void wearArmourIsFailedBecauseIsWrongIndex(){
        //given
        Item armour = new IronArmour(20);
        ((Hero) hero).putItemToInventory(armour);
        //when
        ((Hero) hero).wearArmour(1);
        //then
        assertEquals("", hero.getArmourName());
        assertEquals(-1, hero.getArmourStats());
    }

    @Test
    public void wearArmourIsFailedBecauseIsWrongItemType(){
        //given
        Item sword = new Sword(20);
        ((Hero) hero).putItemToInventory(sword);
        //when
        ((Hero) hero).wearWeapon(0);
        //then
        assertEquals("", hero.getArmourName());
        assertEquals(-1, hero.getArmourStats());
    }

}
