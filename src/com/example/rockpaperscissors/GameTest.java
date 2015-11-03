package com.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Geir on 11/2/2015.
 */
public class GameTest {
    private String[] weapons = {"Rock", "Paper", "Scissors"};

    Game game = new Game();

    @Test
    public void testEvaluateP1Wins() throws Exception {
        Player player1 = new Player();
        player1.setName("Player1");
        player1.setAttack(weapons[0]);
        Player player2 = new Player();
        player2.setAttack(weapons[2]);
        player2.setName("Player2");

        assertEquals(game.evaluate(player1, player2),"Player1 wins!!");
    }

    @Test
    public void testEvaluateP2Wins() throws Exception {
        Player player1 = new Player();
        player1.setName("Player1");
        player1.setAttack(weapons[1]);
        Player player2 = new Player();
        player2.setAttack(weapons[2]);
        player2.setName("Player2");

        assertEquals(game.evaluate(player1, player2),"Player2 wins!!");
    }

    @Test
    public void testEvaluateTie() throws Exception {
        Player player1 = new Player();
        player1.setName("Player1");
        player1.setAttack(weapons[1]);
        Player player2 = new Player();
        player2.setAttack(weapons[1]);
        player2.setName("Player2");

        assertEquals(game.evaluate(player1, player2),"It's a tie.");
    }
}