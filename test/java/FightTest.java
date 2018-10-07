import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FightTest {

    @Test
    public void heroWin(){
        //given
        Character goul = new Goblin("Ms Goul")
                .setWeaponWithCreate(new Sword(20))
                .setArmourWithCreate(new IronArmour(5));

        Character hero = new Hero()
                .setWeaponWithCreate(new Sword(20))
                .setArmourWithCreate(new IronArmour(5));
        //when
        ((Hero) hero).startAttack(goul);
        //then
        assertNotNull(hero);
        assertNotNull(goul);
        assertEquals(0, goul.getHealthPoints());
    }

    @Test
    public void heroLose(){
        //given
        Character goul = new Goblin("Ms Goul")
                .setWeaponWithCreate(new Sword(40))
                .setArmourWithCreate(new IronArmour(5));

        Character hero = new Hero()
                .setWeaponWithCreate(new Sword(20))
                .setArmourWithCreate(new IronArmour(5));
        //when
        ((Hero) hero).startAttack(goul);
        //then
        assertNotNull(hero);
        assertNotNull(goul);
        assertEquals(0, hero.getHealthPoints());
    }
}
