package com.senecafoundation;

public class Ferrari extends Car {

    public int[] seatTemps = { 0, 0, 0, 0 };

    public Ferrari(int rpmFromUser, Boolean isDoorOpenFromUser, int windowsFromUser, int maxRPMFromUser, int[] seatTemps) {
        super(rpmFromUser, isDoorOpenFromUser, windowsFromUser, maxRPMFromUser); // This sends params to base Car constructor
        this.seatTemps = seatTemps; // This sets the only different param for Ferrari (seatTemps)
    }
    
    // Not an override - base Car does not have heatSeats
    public int[] heatSeats() {
        for (int i = 0; i < this.seatTemps.length; i++) {
            this.seatTemps[i] += 30;
        }
        return seatTemps;
    }
}