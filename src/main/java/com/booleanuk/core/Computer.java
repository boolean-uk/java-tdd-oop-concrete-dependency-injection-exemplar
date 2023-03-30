package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;
    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String theGame) {
        Game game = new Game(theGame);
        this.installedGames.add(game);
    }

    public String playGame(String theGame) {
        for (Game g : this.installedGames) {
            if (g.name.equals(theGame)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
