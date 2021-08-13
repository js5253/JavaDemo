package com.senecafoundation;

public class House {
    private int numRooms;

    public int getNumRooms() {
        return numRooms;
    }
    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public void buildRoom() {
        numRooms++;
    }
    public void demolishRoom() {
        numRooms--;
    }
}
