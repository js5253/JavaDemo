public class Microwave {
    public int temperature;
    public boolean power;
    public Microwave() {
        // this.temperature = temperature;
        // this.power = power;
    }
    public void increaseTemp(int temp) {
        temperature += temp;
    }
    public void turnOn() {
        power = true;
    }
    public void turnOff() {
        power = false;
    }
    public void decreaseTemp(int temp) {
        temperature -= temp;
    }

}
