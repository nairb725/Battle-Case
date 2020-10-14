package com.company;

public class Main {

    public static void main(String[] args) {
        GameFunctions.initGame();
        GameFunctions.printGrid();
        while (true) {
            GameFunctions.getPlayer1Movement("Joueur1");
            GameFunctions.printGrid();
            GameFunctions.getPlayer2Movement("Joueur2");
            GameFunctions.printGrid();
        }
    }
}
