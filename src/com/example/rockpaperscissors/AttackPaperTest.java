package com.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Geir on 11/3/2015.
 */
public class AttackPaperTest {
    private String[] weapons = {"Rock", "Paper", "Scissors"};

    @Test
    public void testAttackPaper() throws Exception {
        Attack attack = new AttackPaper();
        assertEquals(attack.getWeapon(),weapons[1]);
        assertEquals(attack.getWinsOver(),weapons[0]);
    }
}