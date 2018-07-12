abstract public class Character implements CharacterInterface{
    String name;
    Weapon weapon=null;
    Armour armour=null;

    Character(String name){
        this.name=name;
    }

    //public void setName(String name){this.name=name;}

    public String getName(){return name;}

    public void setWeapon(Weapon weapon){this.weapon=weapon;}

    //public Weapon getWeapon(){return weapon;}

    public void enchantWeapon(int bonus){
        weapon.enchant(bonus);
    }

    public int getWeaponStats(){
        return weapon.getPoints();
    }

    public void setArmour(Armour armour){this.armour=armour;}

    //public Armour getArmour(){return armour;}

    public void enchantArmour(int bonus){
        armour.enchant(bonus);
    }

    public int getArmourStats(){
        return armour.getPoints();
    }
}