public abstract class Weapon extends Item{

    Weapon(String name, int dmg){
        super(name, dmg);
        typeNumber = 1;
    }
}