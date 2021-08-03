public class Car {
    public Boolean isDoorOpen;
    public int rpms;

    public Car() {
        // rpms = rpm;
        // isDoorOpen = doorOpen;
    }

    public void increaseRpm(int rpm) {
        rpms += rpm;
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
}
