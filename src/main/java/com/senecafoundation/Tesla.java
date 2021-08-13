package com.senecafoundation;

import java.io.Console;

public class Tesla extends Car {
    
    private double batteryPercentage;

    public Tesla(int rpmFromUser, Boolean isDoorOpenFromUser, int windowsFromUser, int maxRPMFromUser) {
        super(rpmFromUser, isDoorOpenFromUser, windowsFromUser, maxRPMFromUser);
        this.batteryPercentage = 100; // or get from parameter from user
    }

    public void navigateOnAutopilot() {
        System.out.println("Navigating on autopilot...");
    }

    public double getBatteryPercentage() {
        return batteryPercentage;
    }
    
    public void setBatteryPercentage(double batteryPercentageFromUser) {
        if (batteryPercentageFromUser < 100) {
            this.batteryPercentage = batteryPercentageFromUser;
        } else {
            System.out.println("Battery must be less than 100");
        }
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
            default:
                System.out.println("You have chosen Space Invaders!");
                break;
        }
        ///TODO - maybe implement the games?
    }
}