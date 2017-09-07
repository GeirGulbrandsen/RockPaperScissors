package com.example.rockpaperscissors;

import java.util.Scanner;

/**
 * Created by Geir on 10/31/2015.
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean wantToPlay = true;

        do {
            Game game = new Game();
            game.play();

            System.out.println("Do you want to play again? (Y/N <enter>):");
            switch (("" + sc.next(".").charAt(0)).toUpperCase()) {
                case "Y":
                    break;
                case "N":
                    wantToPlay = false;
                    break;
                default:
                    System.out.println("That was a Yes/No question. Please try again.");
                    break;
            }
        }
        while (wantToPlay);
    }

}