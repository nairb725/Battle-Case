package com.company;

public class StartGame {

    public static class globalVariables {
        public static int round = 1;
        public static String player1 = "1";
        public static String player2 = "2";
    }

    public static void printGrid() {

        // Matrix init
        String[][] grid = {
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

        // Give players coordinates to grid
        if(globalVariables.round == 1) {
            grid[4][5] = globalVariables.player1;
            grid[5][5] = globalVariables.player2;
            globalVariables.round++;
        }


        // Print grid
        System.out.println(" |---|---|---|---|---|---|---|---|---|---|---|");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (col == 0) {
                    System.out.print(" |");
                }

                System.out.print(" " + grid[row][col] + " |");
            }
            System.out.println();
            System.out.println(" |---|---|---|---|---|---|---|---|---|---|---|");
        }
    }

}
