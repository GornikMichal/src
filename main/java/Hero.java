public class Hero extends Character{

    public Hero() {
        super("Darkan");
        healthPoints=100;
    }

    public void fight(Character enemy){
        for(int i=0; true; ++i){
            if(i%2==0){
                takeDMG(enemy.getWeaponStats());
                if(healthPoints==0){
                    System.out.println("You loose");
                    return;
                }
            }
            else{
                enemy.takeDMG(weapon.getPoints());
                if(enemy.getHealthPoints()==0){
                    System.out.println("You win");
                    return;
                }
            }
        }
    }
}