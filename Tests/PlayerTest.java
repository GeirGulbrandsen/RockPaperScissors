import com.example.rockpaperscissors.Player;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Geir on 11/2/2015.
 */
public class PlayerTest {

    private String[] weapons = {"Rock", "Paper", "Scissors"};

    @Test
    public void testGetAttack() throws Exception {
        Player player = new Player();
        player.setAttack(weapons[0]);
        assertEquals(player.getAttack(),weapons[0]);
    }
    @Test
    public void testSetGetAttack() throws Exception {
        Player player = new Player();
        player.setAttack(weapons[0]);
        assertEquals(player.getAttack(),weapons[0]);
    }

    @Test
    public void testGetWinsOver() throws Exception {
        Player player = new Player();
        player.setAttack(weapons[0]);
        assertEquals(player.getWinsOver(),weapons[2]);
    }

    @Test
    public void testGetName() throws Exception {
        Player player = new Player();
        assertNull(player.getName());
    }

    @Test
    public void testSetGetName() throws Exception {
        String name = "Player1";
        Player player = new Player();
        player.setName(name);
        assertEquals(player.getName(),name);
    }
}