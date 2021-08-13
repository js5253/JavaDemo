package com.senecafoundation;

import java.io.Console;

public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car(100, true, 2, 200); //in the future, this could change to a Tesla or Ferrari
        Grill grill = new Grill();
        Microwave microwave = new Microwave();
        House house = new House();
        Console c = System.console();
        System.out.println("As you finish working, you return home. This is a retelling of the events that happen");
        car.decreaseRpm(1000);
        System.out.println("Your car has completely stopped. ");
        System.out.println("Do you want to open the door?");
        if (c.readLine().equalsIgnoreCase("y")) {
            car.openDoor();
            System.out.println("Alright. The door is open and now you're walking to your house.");
            car.closeDoor();
            System.out.println("You're now inside the house. Your car's door is closed.");
            System.out.println("Do you want to make lunch (and grill steak or something)?");
            if (c.readLine().equalsIgnoreCase("y")) {
                grill.turnOn();
                grill.increaseTemp(40);
                grill.turnOff();
                System.out.println("You've successfully cooked the meat at: " + grill.temperature);

            }
            System.out.println("Want to microwave chicken tendies?");
            if (c.readLine().equalsIgnoreCase("y")) {
                microwave.turnOn();
                microwave.increaseTemp(40);
                microwave.turnOff();
                System.out.println("You've successfully cooked the chicken tendies at: " + microwave.temperature);
            }
            System.out.println("Your house is ugly! Want to renovate it and build more rooms?");
            if (c.readLine().equalsIgnoreCase("y")) {
                System.out.println("How many rooms to build?");
                int rooms = Integer.parseInt(c.readLine());
                for (int i = 0; i < rooms; i++) {
                    house.buildRoom();
                }
                System.out.println("Your house now has " + house.numRooms + " rooms and isn't as ugly.");
            }
        }
    }
}
