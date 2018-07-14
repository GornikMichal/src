public class Hammer extends Weapon{

    public Hammer(int dmg) {
        super("Hammer", dmg);
    }

    public Hammer(String name, int dmg) {
        super(name, dmg);
    }

    public void enchant(int bonusPoints){
        points=points+bonusPoints;
    }
}