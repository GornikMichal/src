public abstract class Item  implements EnchantInterface{
    String name;
    int points;

    Item(String name, int points){
        this.name=name;
        this.points=points;
    }

    public int getPoints(){return points;}

    public String getName(){return name;}
}
