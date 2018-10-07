import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    Inventory(){
        items = new ArrayList<Item>();
    }

    void addItem(Item item){
        items.add(item);
    }

    void showInventory(){
        int i = 1;

        for (Item item : items) {
            System.out.print(i + ". ");
            ++i;
            System.out.println(item.getName());
        }
    }

    Item returnAndRemoveItem(int index){
        Item item = items.get(index);
        items.remove(index);

        return item;
    }

    void removeItem(int index){
        items.remove(index);
    }

    int getInventorySize(){
        return items.size();
    }

    int getItemNumberType(int indeks){
        return items.get(indeks).getTypeNumber();
    }
}
