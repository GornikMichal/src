public class IronArmour extends Armour{

    public IronArmour(int dmg) {
        super("IronAromur", dmg);
    }

    IronArmour(String name, int armourPoints){
        super(name, armourPoints);
    }

    public void enchant(int bonusPoints) {
        points=points+bonusPoints;
    }
}
