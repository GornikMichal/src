public class Hero extends Character{

    int currentLocation;
    Inventory inventory;

    public Hero() {
        super("Darkan");
        healthPoints = 100;
        maxHealthPoints = 100;
        currentLocation = 0;
        inventory = new Inventory();
    }

    void startAttack(Location []location){
        Character enemy = location[ currentLocation ].randomEnemy( location[ currentLocation ].randInt() );
        Fight.fight(this, enemy);
    }

    void startAttack(Character enemy){
        Fight.fight(this, enemy);
    }

    void putItemToInventory(Item item){
        inventory.addItem(item);
    }

    void checkInventory(){
        inventory.showInventory();
    }

    int getInventorySize(){
        return inventory.getInventorySize();
    }

    void dropItemFromInventory(int index){
        if(inventory.getInventorySize() > index && index >= 0) {
            inventory.removeItem(index);
        } else{
            System.out.println("Wrong item number.");
        }
    }

    void wearWeapon(int index){
        if(inventory.getInventorySize() > index && index >= 0) {
            if(inventory.getItemNumberType(index) == 1){
                if(weapon != null) {inventory.addItem(weapon);}
                weapon = (Weapon)inventory.returnAndRemoveItem(index);
            } else{
                System.out.println("Wrong weapon number.");
            }
        } else{
            System.out.println("Wrong item number.");
        }
    }

    void wearArmour(int index){
        if(inventory.getInventorySize() > index && index >= 0) {
            if(inventory.getItemNumberType(index) == 2){
                if(armour != null) {inventory.addItem(armour);}
                armour = (Armour)inventory.returnAndRemoveItem(index);
            } else{
                System.out.println("Wrong armour number.");
            }
        } else{
            System.out.println("Wrong item number.");
        }
    }
}