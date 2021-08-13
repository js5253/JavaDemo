package com.senecafoundation;

public class Car {
    private Boolean isDoorOpen;
    private int rpms;
    private int windows;

    public void setWindows(int windows) {
        this.windows = windows;
    }
    public int getWindows() {
        return windows;
    }

    public Boolean getIsDoorOpen() {
        return isDoorOpen;
    }
    public void setIsDoorOpen(Boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }

    public int getRpms() {
        return rpms;
    }

    public void setRpms(int rpms) {
        if (rpms > 200) {
            System.out.println("That's too many rpms, it would break the car");
            this.rpms = 0; 
        }
        else {
            this.rpms = rpms;  
        }
    }

    public Car(int rpmFromUser, Boolean isDoorOpenFromUser, int windowsFromUser) {
        this.rpms = rpmFromUser;
        this.isDoorOpen = isDoorOpenFromUser;
        this.windows = windowsFromUser;
    }

    public void increaseRpm(int rpmfromuser) {
        this.rpms += rpmfromuser;
    }

    public void decreaseRpm(int rpmfromuser) {
        this.rpms -= rpmfromuser;
    }

    public void openDoor() {
        this.isDoorOpen = true;
    }

    public void closeDoor() {
        this.isDoorOpen = false;
    }
}
