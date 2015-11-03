package com.example.rockpaperscissors;

import java.util.Scanner;

/**
 * Created by Geir on 11/2/2015.
 */
public class PlayerHuman extends Player {

    public PlayerHuman(String[] weapons) {
        super();

        String weapon = null;
        Scanner sc = new Scanner(System.in);

        while (weapon == null) {
            System.out.println("[R]ock\n[P]aper\n[S]cissors");
            System.out.println("Please select weapon:");

            switch (("" + sc.next(".").charAt(0)).toUpperCase()) {
                case "R":
                    weapon = weapons[0];
                    break;
                case "P":
                    weapon = weapons[1];
                    break;
                case "S":
                    weapon = weapons[2];
                    break;
                default:
                    System.out.println("Not a valid choice. Please try again.");
                    break;
            }
        }
        setAttack(weapon);
    }
}
