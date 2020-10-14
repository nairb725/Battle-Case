package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GameFunctions {

    public static class globalVariables {
        // Declaration of variables
        public static String SignPlayer1 = "1";
        public static String SignPlayer2 = "2";
        public static int[] player1Coordinates = {4, 5};
        public static int[] player2Coordinates = {5, 5};
        public static String[][] grid = {
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };
    }

    public static void initGame() {
        // Init positions of players
        int rowP1 = globalVariables.player1Coordinates[0];
        int colP1 = globalVariables.player1Coordinates[1];
        int rowP2 = globalVariables.player2Coordinates[0];
        int colP2 = globalVariables.player2Coordinates[1];

        globalVariables.grid[rowP1][colP1] = globalVariables.SignPlayer1;
        globalVariables.grid[rowP2][colP2] = globalVariables.SignPlayer2;
    }

    public static void printGrid() {

        // Draw grid
        int rowCounter = 0;
        System.out.println("\n    0   1   2   3   4   5   6   7   8   9  10");
        System.out.println("  |---|---|---|---|---|---|---|---|---|---|---|");

        for (int row = 0; row < globalVariables.grid.length; row++) {
            for (int col = 0; col < globalVariables.grid[row].length; col++) {
                if (col == 0) {
                    System.out.print(rowCounter + " |");
                    rowCounter++;
                }

                System.out.print(" " + globalVariables.grid[row][col] + " |");
            }
            System.out.println();
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|---| ");
        }
        System.out.println();
    }

    public static void getPlayer1Movement(String player1Name) {

        while (true) {
            // Get player movement
            System.out.println(player1Name + ", à toi de te déplacer ! (z, q, s, d) : ");
            Scanner movementInput = new Scanner(System.in);
            char movement = movementInput.next().charAt(0);

            if (movement == 'z') {

                // Change player coordinates
                globalVariables.player1Coordinates[0] -= 1;
                int rowP1 = globalVariables.player1Coordinates[0];
                int colP1 = globalVariables.player1Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP1][colP1] = globalVariables.SignPlayer1;

                // Clear compartment
                globalVariables.grid[rowP1 + 1][colP1] = " ";
                break;
            }
            else if (movement == 's') {

                // Change player coordinates
                globalVariables.player1Coordinates[0] += 1;
                int rowP1 = globalVariables.player1Coordinates[0];
                int colP1 = globalVariables.player1Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP1][colP1] = globalVariables.SignPlayer1;

                // Clear compartment
                globalVariables.grid[rowP1 - 1][colP1] = " ";
                break;
            }
            else if (movement == 'q') {

                // Change player coordinates
                globalVariables.player1Coordinates[1] -= 1;
                int rowP1 = globalVariables.player1Coordinates[0];
                int colP1 = globalVariables.player1Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP1][colP1] = globalVariables.SignPlayer1;

                // Clear compartment
                globalVariables.grid[rowP1][colP1 + 1] = " ";
                break;
            }
            else if (movement == 'd') {

                // Change player coordinates
                globalVariables.player1Coordinates[1] += 1;
                int rowP1 = globalVariables.player1Coordinates[0];
                int colP1 = globalVariables.player1Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP1][colP1] = globalVariables.SignPlayer1;

                // Clear compartment
                globalVariables.grid[rowP1][colP1 - 1] = " ";
                break;
            }
            else {
                System.out.println("Le caractère saisi est incorrect");
            }
        }
    }

    public static void getPlayer2Movement(String player2Name) {

        while (true) {
            // Get player movement
            System.out.println(player2Name + ", à toi de te déplacer ! (z, q, s, d) : ");
            Scanner movementInput = new Scanner(System.in);
            char movement = movementInput.next().charAt(0);

            if (movement == 'z') {

                // Change player coordinates
                globalVariables.player2Coordinates[0] -= 1;
                int rowP2 = globalVariables.player2Coordinates[0];
                int colP2 = globalVariables.player2Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP2][colP2] = globalVariables.SignPlayer2;

                // Clear compartment
                globalVariables.grid[rowP2 + 1][colP2] = " ";
                break;
            }
            else if (movement == 's') {

                // Change player coordinates
                globalVariables.player2Coordinates[0] += 1;
                int rowP2 = globalVariables.player2Coordinates[0];
                int colP2 = globalVariables.player2Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP2][colP2] = globalVariables.SignPlayer2;

                // Clear compartment
                globalVariables.grid[rowP2 - 1][colP2] = " ";
                break;
            }
            else if (movement == 'q') {

                // Change player coordinates
                globalVariables.player2Coordinates[1] -= 1;
                int rowP2 = globalVariables.player2Coordinates[0];
                int colP2 = globalVariables.player2Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP2][colP2] = globalVariables.SignPlayer2;

                // Clear compartment
                globalVariables.grid[rowP2][colP2 + 1] = " ";
                break;
            }
            else if (movement == 'd') {

                // Change player coordinates
                globalVariables.player2Coordinates[1] += 1;
                int rowP2 = globalVariables.player2Coordinates[0];
                int colP2 = globalVariables.player2Coordinates[1];

                // Give position of player to grid
                globalVariables.grid[rowP2][colP2] = globalVariables.SignPlayer2;

                // Clear compartment
                globalVariables.grid[rowP2][colP2 - 1] = " ";
                break;
            }
            else {
                System.out.println("Le caractère saisi est incorrect");
            }
        }
    }



}
