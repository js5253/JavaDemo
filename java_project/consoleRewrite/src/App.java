public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Grill grill = new Grill();
        Microwave microwave = new Microwave();
        House house = new House();

        System.out.println("As you finish working, you return home. This is a retelling of the events that happen");
        car.decreaseRpm(1000);
        System.out.println("Your car has completely stopped. ");
        System.out.println("Do you want to open the door?");
        if (System.in.read() == 'y') {
            car.openDoor();
            System.out.println("Alright. The door is open and now you're walking to your house.");
            car.closeDoor();
            System.out.println("You're now inside the house. Your car's door is closed.");
            System.out.println("Do you want to make lunch (and grill steak or something)?");
            if (System.in.read() == 'y') {
                grill.turnOn();
                grill.increaseTemp(40);
                grill.turnOff();
                System.out.println("You've successfully cooked the meat at: " + grill.temperature);

            }
            System.out.println("Want to microwave chicken tendies?");
            if (System.in.read() == 'y') {
                microwave.turnOn();
                microwave.increaseTemp(40);
                microwave.turnOff();
                System.out.println("You've successfully cooked the chicken tendies at: " + microwave.temperature);
            }
            System.out.println("Your House is ugly! Want to renovate it and build more rooms?");
            if (System.in.read() == 'y') {
                System.out.println("How many rooms to build?");
                // for (int i = 0; i < Integer.parseInt(System.console().readLine()); i++) {
                //     house.buildRoom();
                // }
                System.out.println("Your house now has " + house.numRooms + " rooms.");
            }
        }
    }
}
