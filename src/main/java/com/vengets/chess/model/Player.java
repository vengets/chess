package com.vengets.chess.model;

import com.vengets.chess.model.kingdom.Kingdom;

public class Player {
    private String name;
    private Kingdom kingdom;

    public Player(Kingdom kingdom, String name) {
        this.kingdom = kingdom;
        this.name = name;
    }

    public Kingdom getKingdom() {
        return kingdom;
    }

    public String getName() {
        return name;
    }

}
