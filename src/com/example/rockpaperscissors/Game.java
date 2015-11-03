package com.example.rockpaperscissors;

import java.util.Scanner;

/**
 * Created by Geir on 10/31/2015.
 */
public class Game {

    private String[] weapons = {"Rock", "Paper", "Scissors"};

    public void play() {
        Scanner sc = new Scanner(System.in);
        Player player1 = null;
        Player player2;

        System.out.println("Hello. Shall we play a game?\n");

        do {
            System.out.println("(P)layer vs. Computer");
            System.out.println("(C)omputer vs. Computer");
            System.out.println("Select type of game (P/C <enter>):");

            // Player2 is always computer
            player2 = new PlayerComputer(weapons);

            switch ((("" + (sc.next(".").charAt(0)))).toUpperCase()) {
                case "P":
                    player1 = new PlayerHuman(weapons);
                    player1.setName("Player");
                    player2.setName("Computer");
                    break;
                case "C":
                    player1 = new PlayerComputer(weapons);
                    player1.setName("Computer1");
                    player2.setName("Computer2");
                    break;
                default:
                    System.out.println("That was a P/C question. Please try again.");
                    break;
            }
        } while (player1==null);

        System.out.println(this.evaluate(player1,player2));
    }

    public String evaluate (Player player1, Player player2) {
        String result;

        System.out.println(player1.getName() + " has " + player1.getAttack());
        System.out.println(player2.getName() + " has " + player2.getAttack());
        if (player1.getAttack().equals(player2.getAttack())) {
            result = "It's a tie.";
        } else {
            if (player1.getWinsOver().equals(player2.getAttack())) {
                result = player1.getName() + " wins!!";

            } else result = player2.getName() + " wins!!";
        }
        return result;
    }
}
