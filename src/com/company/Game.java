package com.company;

public class Game implements UserChoiceListener{
    Storage storage;
    View view;
    Location currentLocation;

    Game(Storage storage, View view){
        this.storage = storage;
        this.view = view;
    }
    void start(){
        currentLocation = storage.getLocation(0);
        view.showLocation(currentLocation);
    }
    public void userChoice(int actionIndex){
        int idLoc = currentLocation.getActions()[actionIndex].getNextLocationId();
        if (idLoc != -1) {
            currentLocation = storage.getLocation(idLoc);
            view.showLocation(currentLocation);
        }
    }
}
