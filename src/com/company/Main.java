package com.company;

public class Main {

    public static void main(String[] args) {
         Storage storage = new Storage();
         View v = new View();
         Game game = new Game(storage, v);
         v.setUserChoiceListener(game);
         game.start();
    }
}
