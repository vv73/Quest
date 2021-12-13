package com.company;

public class View {
    void show(Location location){
        System.out.println(location.getText());
        Action[] actions = location.getActions();
        for (int i = 0; i < actions.length; ++i){
            System.out.println(i + 1 + ") "+ actions[i].getText());
        }
    }
}
