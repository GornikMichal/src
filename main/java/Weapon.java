public abstract class Weapon extends Item implements WeaponInterface, EnchantInterface{

    Weapon(String name, int dmg){
        super(name, dmg);
    }
}