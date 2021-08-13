package com.senecafoundation;

public class Ferrari extends Car {
    public int MAX_RPM = 10000;
    public int[] seat_temps = { 0, 0, 0, 0 };

    public Ferrari() {
        super(false, 3000, "ELECTRIC", 10000);
    }

    public int[] heatSeats() {
        for (int i = 0; i < seat_temps.length; i++) {
            seat_temps[i] += 30;
        }
        return seat_temps;
    }
}