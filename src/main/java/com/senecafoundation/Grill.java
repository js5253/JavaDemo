package com.senecafoundation;

public class Grill {
    public int temperature;
    public boolean power;

    public Grill implements Grillinterface () {
        // temperature = temp;
        // power = false;
    }
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