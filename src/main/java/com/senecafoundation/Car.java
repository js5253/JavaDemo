package com.senecafoundation;

public class Car {
    // note that we assign a value when creating the variables
    // these are default values
    public static int MAX_RPM = 5000;
    public Boolean isDoorOpen = false;
    public int rpms = 0;
    public String type = "GAS";

    //several ways to have parameters - method overloading is the simplest,
    //where one function has a bunch of parameters
    //and the other has none

    //depending on whether there are parameters in the constructor, it will
    //run the appropriate function
    public Car(Boolean doorOpen, int rpm, String engineType, int maxRPM) {
        rpms = rpm;
        type = engineType;
        isDoorOpen = doorOpen;
        MAX_RPM = maxRPM;
    }
    public Car() {
        //because we're not passing any parameters,
        //we'll just use the default values

    }

    public void increaseRpm(int rpm) {
        if (MAX_RPM < rpms) {
            rpms += rpm;
        }

    }

    public void decreaseRpm(int rpm) {
        rpms -= rpm;
    }

    public void openDoor() {
        isDoorOpen = true;
    }

    public void closeDoor() {
        isDoorOpen = false;
    }

    // example of a method that should remain in any car
    public void outputDetails() {
        System.out.println("Car Details");
        System.out.println("RPM: " + rpms);
        System.out.println("Door Open: " + isDoorOpen);
        System.out.println("This car's max RPMs: " + MAX_RPM);
    }
}
