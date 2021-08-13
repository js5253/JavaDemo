package com.senecafoundation;

public class Grill {
    public int temperature;
    public boolean power;

    public Grill() {
        // temperature = temp;
        // power = false;
    }

    static int MAX_POWER = 1000;

    static int MAX_TEMP = 500;

    public void increaseTemp(int temp) {
        temperature += temp;
    }
    public void decreaseTemp(int temp) {
        temperature -= temp;
    }
    public void turnOn() {
        power = true;
    }
    public void turnOff() {
        power = false;
    }
}