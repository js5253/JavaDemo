using System;
//this is a comment. it's not going to be interpreted by C# and is used to annotate important parts of the code
//classes are like blueprints. think of a factory - they need to know information on the parts needed to create a product
namespace seneca_project
{
    class App
    {
        static void Main()
        {
            Car car = new Car(1000);
            Grill grill = new Grill(0);
            Microwave microwave = new Microwave(0);
            House house = new House();

            Console.WriteLine("As you finish working, you return home. This is a retelling of the events that happen.");
            car.decreaseRpm(1000);
            Console.WriteLine("Your car has completely stopped now.");
            Console.WriteLine("Do you want to open the door and walk to your house?"); //outputs something to the terminal; in this case asks if you want to open the door
            String response = Console.ReadLine(); //gets text the user inputs in the terminal

            if (response == "yes")
            {
                car.openDoor();
                Console.WriteLine("Alright. The door is open and now you're walking into your house.");
                car.closeDoor();
                Console.WriteLine("You're now inside the house. Your car's door is closed.");
                Console.WriteLine("Do you want to make lunch (and grill steak or something)?");
                String grillResponse = Console.ReadLine();
                if (grillResponse == "yes")
                {
                    grill.turnOn();
                    grill.increaseTemp(40);
                    grill.turnOff();
                    Console.WriteLine("You've successfully cooked the meat, at " + grill.temperature + " degrees.");
                }
                Console.WriteLine("Do you want to microwave chicken tendies?");
                String microwaveResponse = Console.ReadLine();
                if (microwaveResponse == "yes")
                {
                    microwave.turnOn();
                    microwave.increaseTemp(20);
                    microwave.turnOff();
                    Console.WriteLine("The microwave is now at " + microwave.temperature + "degrees");

                }
                Console.WriteLine("Your house is ugly! Want to renovate it and add a room?");
                String houseResponse = Console.ReadLine();
                if (houseResponse == "yes")
                {
                    Console.WriteLine("How many rooms to build?");
                    int numRooms = int.Parse(Console.ReadLine()); //by default the console gets text, so this will convert it into a number
                    for (int i = 0; i < numRooms; i++)
                    { //loops to build the rooms
                        house.buildRoom();
                    }
                    Console.WriteLine($"Your house now has {house.numRooms} rooms, and isn't as ugly anymore. Congrats!"); //note the string interpolation - you don't have to add multiple things together
                }

            }
        }
    }
}