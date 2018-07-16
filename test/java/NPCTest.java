import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NPCTest {

    Character npc;

    @Before
    public void npcCreationWithoutItems(){
        npc = new NPC("Anna");
    }

    @Test
    public void npcCreationWasSuccessful(){
        //then
        assertNotNull(npc);
        assertEquals("Anna", npc.getName());
    }

    @Test
    public void npcCreationWithWeaponSuccesfull(){
        //given
        Weapon sword = new Sword(20);
        //when
        Character npc2 = new NPC("Grunt")
                .setWeaponWithCreate(sword);
        //then
        assertNotNull(sword);
        assertNotNull(npc2);
        assertEquals(20, npc2.getWeaponStats());
        assertEquals("Sword", npc2.getWeaponName());
        assertEquals("Grunt", npc2.getName());
    }

    @Test
    public void npcCreationWithArmourSuccesfull(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        Character npc2 = new NPC("Grunt")
                .setArmourWithCreate(ironArmour);
        //then
        assertNotNull(ironArmour);
        assertNotNull(npc2);
        assertEquals(20, npc2.getArmourStats());
        assertEquals("Iron Armour", npc2.getArmourName());
        assertEquals("Grunt", npc2.getName());
    }

    @Test
    public void npcCreationWithWeaponAndArmourSuccesfull(){
        //given
        Weapon sword = new Sword(20);
        Armour ironArmour = new IronArmour(20);
        //when
        Character npc2 = new NPC("Grunt")
                .setWeaponWithCreate(sword)
                .setArmourWithCreate(ironArmour);
        //then
        assertNotNull(sword);
        assertNotNull(ironArmour);
        assertNotNull(npc2);
        assertEquals(20, npc2.getWeaponStats());
        assertEquals("Sword", npc2.getWeaponName());
        assertEquals(20, npc2.getArmourStats());
        assertEquals("Iron Armour", npc2.getArmourName());
        assertEquals("Grunt", npc2.getName());
    }

    @Test
    public void setWeaponAfterCreationNpc(){
        //given
        Weapon sword = new Sword(20);
        //when
        npc.setWeapon(sword);
        //then
        assertNotNull(sword);
        assertEquals(20, npc.getWeaponStats());
        assertEquals("Sword", npc.getWeaponName());
    }

    @Test
    public void setArmourAfterCreationNpc(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        npc.setArmour(ironArmour);
        //then
        assertNotNull(ironArmour);
        assertEquals(20, npc.getArmourStats());
        assertEquals("Iron Armour", npc.getArmourName());
    }

    @Test
    public void enchantWeapon(){
        //given
        Weapon sword = new Sword(20);
        //when
        npc.setWeapon(sword);
        npc.enchantWeapon(10);
        //then
        assertNotNull(sword);
        assertEquals(30, npc.getWeaponStats());
        assertEquals("Sword", npc.getWeaponName());
    }

    @Test
    public void enchantArmour(){
        //given
        Armour ironArmour = new IronArmour(20);
        //when
        npc.setArmour(ironArmour);
        npc.enchantArmour(10);
        //then
        assertNotNull(ironArmour);
        assertEquals(30, npc.getArmourStats());
        assertEquals("Iron Armour", npc.getArmourName());
    }

    @Test
    public void getNpcHealthPoints(){
        assertEquals(100, npc.getHealthPoints());
    }

    @Test
    public void npcGetDmgAboveMinHealthPoints(){
        //when
        npc.takeDMG(10);
        //then
        assertEquals(90, npc.getHealthPoints());
    }

    @Test
    public void npcGetDmgUnderMinHealthPoints(){
        //when
        npc.takeDMG(200);
        //then
        assertEquals(0, npc.getHealthPoints());
    }

    @Test
    public void npcGetHealthUnderMaxHealthPoints(){
        //when
        npc.takeDMG(20);
        npc.heal(10);
        //then
        assertEquals(90, npc.getHealthPoints());
    }

    @Test
    public void npcGetHealthAboveMaxHealthPoints(){
        //when
        npc.heal(10);
        //then
        assertEquals(100, npc.getHealthPoints());
    }
}
