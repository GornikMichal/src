public class Sword extends Weapon{

    public Sword(String name, int dmg) {
        super(name, dmg);
    }

    public void enchant(int bonusPoints){
        points=points+bonusPoints;
    }
}
