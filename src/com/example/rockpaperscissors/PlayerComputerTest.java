package com.example.rockpaperscissors;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Geir on 11/2/2015.
 */
public class PlayerComputerTest {

    private String[] weapons = {"Rock", "Paper", "Scissors"};

    @Test
    public void testGetAttack() throws Exception {
        PlayerComputer player = new PlayerComputer(weapons);
        System.out.println(player.getAttack());
        assertTrue(Arrays.asList(weapons).contains(player.getAttack()));
    }

    @Test
    public void testSetGetAttack() throws Exception {
        PlayerComputer player = new PlayerComputer(weapons);
        player.setAttack(weapons[0]);
        assertEquals(player.getAttack(),weapons[0]);
    }

    @Test
    public void testGetWinsOver() throws Exception {
        PlayerComputer player = new PlayerComputer(weapons);
        player.setAttack(weapons[0]);
        assertEquals(player.getWinsOver(),weapons[2]);
    }

    @Test
    public void testGetName() throws Exception {
        PlayerComputer player = new PlayerComputer(weapons);
        assertNull(player.getName());
    }

    @Test
    public void testSetGetName() throws Exception {
        String name = "Player1";
        PlayerComputer player = new PlayerComputer(weapons);
        player.setName(name);
        assertEquals(player.getName(), name);
    }

}