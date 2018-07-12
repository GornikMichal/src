public abstract class Item {
    String name;
    int points;

    Item(String name, int points){
        this.name=name;
        this.points=points;
    }

    //public void Points(int points){this.points=points;}

    public int getPoints(){return points;}

    //public void setName(String name){this.name=name;}

    public String getName(){return name;}
}
