public abstract class Fight {

    public static void fight(Character hero, Character enemy){
        for(int i=0; true; ++i){
            if(i%2==0){
                hero.takeDMG(enemy.getWeaponStats());
                if(hero.getHealthPoints()==0){
                    System.out.println("You loose");
                    return;
                }
            }
            else{
                enemy.takeDMG(hero.getWeaponStats());
                if(enemy.getHealthPoints()==0){
                    System.out.println("You win");
                    return;
                }
            }
        }
    }
}
