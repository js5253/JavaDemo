package com.senecafoundation;

public class Grill implements Grillinterface {
    public int temperature;
    public boolean power;

    public Grill () {
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