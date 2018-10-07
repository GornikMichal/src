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

    public String getWeaponName(){
        if(weapon != null) {
            return weapon.getName();
        } else{
            return "";
        }
    }

    public int getWeaponStats(){
        if(weapon != null) {
            return weapon.getPoints();
        } else{
            return -1;
        }
    }

    public void setArmour(Armour armour){this.armour=armour;}

    public int getArmourStats(){
        if(armour != null) {
            return armour.getPoints();
        } else{
            return -1;
        }
    }

    public String getArmourName(){
        if(armour != null) {
            return armour.getName();
        } else{
            return "";
        }
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
}