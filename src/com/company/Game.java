package com.company;

public class Game implements UserChoiceListener{
    private Storage storage;
    private View view;
    private Location currentLocation;

    public Game(Storage storage) {
        this.storage = storage;
        this.view = new View(this);
    }
    public void start(){
        currentLocation = storage.getLocation(0);
        view.showLocation(currentLocation);
    }
    public void userChoice(int actionIndex){
        int idLoc = currentLocation.getActions()[actionIndex].getDestLocationId();
        if (idLoc != -1){
            currentLocation = storage.getLocation(idLoc);
            view.showLocation(currentLocation);
        }
    }
}
