abstract public class Character{
    String name;
    int healthPoints;
    int maxHealthPoints;
    Weapon weapon=null;
    Armour armour=null;

    Character(String name){
        this.name=name;
    }

    public Character setWeaponWithCreate(Weapon weapon){
        this.weapon=weapon;
        return this;
    }

    public Character setArmourWithCreate(Armour armour){
        this.armour=armour;
        return this;
    }

    public String getName(){return name;}

    public void setWeapon(Weapon weapon){this.weapon=weapon;}

    public void enchantWeapon(int bonus){
        weapon.enchant(bonus);
    }

    public String getWeaponName(){
        return weapon.getName();
    }

    public int getWeaponStats(){
        return weapon.getPoints();
    }

    public void setArmour(Armour armour){this.armour=armour;}

    public void enchantArmour(int bonus){
        armour.enchant(bonus);
    }

    public int getArmourStats(){
        return armour.getPoints();
    }

    public String getArmourName(){
        return armour.getName();
    }


    public int getHealthPoints(){
        return healthPoints;
    }

    public void takeDMG(int DMG){
        healthPoints=healthPoints-DMG;
        if(healthPoints<0){
            healthPoints=0;
        }
    }

    public void heal(int healPoints){
        healthPoints=healthPoints+healPoints;
        if(healthPoints>maxHealthPoints){
            healthPoints=maxHealthPoints;
        }
    }


    public void fight(Character enemy){
        Fight.fight(this, enemy);
    }
}