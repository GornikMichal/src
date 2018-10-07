public abstract class Item {
    String name;
    int points;
    int typeNumber;

    Item(String name, int points){
        this.name=name;
        this.points=points;
    }

    public int getPoints(){return points;}

    public String getName(){return name;}

    public int getTypeNumber(){
        return typeNumber;
    }

}
