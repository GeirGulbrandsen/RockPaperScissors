package com.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Geir on 11/3/2015.
 */
public class AttackScissorsTest {
    private String[] weapons = {"Rock", "Paper", "Scissors"};

    @Test
    public void testAttackScissors() throws Exception {
        Attack attack = new AttackScissors();
        assertEquals(attack.getWeapon(),weapons[2]);
        assertEquals(attack.getWinsOver(),weapons[1]);
    }
}