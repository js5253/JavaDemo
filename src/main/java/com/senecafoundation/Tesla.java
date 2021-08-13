package com.senecafoundation;

import java.io.Console;

public class Tesla extends Car {
    static {
        MAX_RPM = 20000;
    }

    public Tesla() {
        super();
    }

    public void navigateOnAutopilot() {
        System.out.println("Navigating on autopilot...");
    }

    public void playVideogamesOnCar() {
        System.out.println("Which videogame do you want to play?");

        // gets input from console to see which videogame they want to play

        Console c = System.console();

        switch (c.readLine()) {
            case "Frogger":
                System.out.println("You have chosen Frogger!");
                break;
            case "Space Invaders":
                System.out.println("You have chosen Space Invaders!");
                break;
        }
    }
}