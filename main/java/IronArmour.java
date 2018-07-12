public class IronArmour extends Armour{
    IronArmour(String name, int armourPoints){
        super(name, armourPoints);
    }

    public void enchant(int bonusPoints) {
        points=points+bonusPoints;
    }
}
