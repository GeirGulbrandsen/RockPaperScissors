import com.example.rockpaperscissors.Attack;
import com.example.rockpaperscissors.AttackRock;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Geir on 11/3/2015.
 */
public class AttackRockTest {
    private String[] weapons = {"Rock", "Paper", "Scissors"};

    @Test
    public void testAttackRock() throws Exception {
        Attack attack = new AttackRock();
        assertEquals(attack.getWeapon(),weapons[0]);
        assertEquals(attack.getWinsOver(),weapons[2]);
    }
}