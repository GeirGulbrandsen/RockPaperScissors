package com.example.rockpaperscissors;

/**
 * Created by Geir on 11/2/2015.
 */
public class PlayerComputer extends Player {

    public PlayerComputer(String[] weapons) {
        super();

        setAttack(weapons[(int)(Math.random()*weapons.length)]);
        }
}
