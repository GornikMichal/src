import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ValleyOfPieceTest {

    Location valleyOfPiece;

    @Before
    public void heroCreation(){
        valleyOfPiece = new ValleyOfPiece();
    }

    @Test
    public void valleyOfPieceCreationWasSuccessful(){
        //then
        assertNotNull(valleyOfPiece);
    }

    @Test
    public void chooseRandomIdWasSuccessful(){
        //then
        assertEquals(1, valleyOfPiece.randInt());
    }

    @Test
    public void returnGoblinEnemy(){
        //when
        Character goblin = valleyOfPiece.randomEnemy(1);
        Goblin goblin2 = (Goblin)goblin;
        //then
        assertEquals(goblin, goblin2);
        assertNotNull(goblin);
    }
}
