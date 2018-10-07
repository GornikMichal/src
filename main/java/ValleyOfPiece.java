import java.util.Random;

public class ValleyOfPiece implements Location{
    int locationID;

    ValleyOfPiece(){
        locationID  =  0;
    }

    public Character randomEnemy( int randId ) {
/*
metoda powinna zwracać odpowiedniego przeciwnika do walki z bohaterem

 */

        switch (randId){
            case 1 :
                Character goul = new Goblin("Ms Goul")
                    .setWeaponWithCreate(new Sword( "WoodSword", 5));
                return goul;
            default:
                return null;
        }
    }

    public int randInt(){
        Random generator = new Random();
        int randID = generator.nextInt(1) + 1;
        return randID;
    }
}
