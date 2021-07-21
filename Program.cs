using System;
//this is a comment. it's not going to be interpreted by C# and is used to annotate important parts of the code
//classes are like blueprints. think of a factory - they need to know information on the parts needed to create a product
namespace seneca_project
{

    public class Microwave
    {
        public int temperature
        { //this is a property - the temperature of the microwave
            get;
            set;
        }
        public Microwave(int temp = 0)
        { //this fn is a constructor - you can use it to assign initial variables when an object is made
            temperature = temp;
        }
        //the following two fns will be used to increment and decrement the temperature
        public void increaseTemp(int temp)
        {
            temperature += temp;
        }
        public void decreaseTemp(int temp)
        {
            temperature -= temp;
        }
    }
    public class Car
    {
        //property of rpms
        public Boolean isDoorOpen
        {
            get;
            set;
        }
        public int rpm
        {
            get;
            set;
        }
        public Car(Boolean isDoorOpens, int rpms = 0)
        { //constructor
            rpm = rpms;
            isDoorOpen = isDoorOpens;
        }
        //used to increment and decrement rpm
        public void increaseRpm(int rpms)
        {
            rpm += rpms;
        }
        public void decreaseRpm(int rpms)
        {
            rpm -= rpms;
        }
    }
    public class Grill
    {
        //property of temperature
        public int temperature
        {
            get;
            set;
            }
        public Grill(int temp = 0)
        { //constructor
            temperature = temp;
        }
        //used to increment and decrement the temperature
        public void increaseTemp(int temp)
        {
            temperature += temp;
        }
        public void decreaseTemp(int temp)
        {
            temperature -= temp;
        }
    }
    public class House
    {
        //property of amount of rooms
        public int numRooms
        {
            get;
            set;
        }
        public House()
        { //contructor
            numRooms = 0;
        }
        //these two are a bit different - they build and demolish a room every time they are called
        public void buildRoom()
        {
            numRooms += 1;
        }
        public void demolishRoom()
        {
            numRooms -= 1;
        }
    }
    class App
    {
        static void Main()
        {
            Car car = new Car(false, 1000);
            Grill grill = new Grill(0);
            Microwave microwave = new Microwave(0);
            House house = new House();

            //this will ask different things to tie the different objects together

            Console.WriteLine("Do you want to open the door?"); //outputs something to the terminal; in this case asks if you want to open the door
            String response = Console.ReadLine(); //gets text the user inputs in the terminal

            if (response == "yes")
            {
                car.isDoorOpen = true; //sets the door to open
                Console.WriteLine("You're now inside the house. Your car's door is: " + car.isDoorOpen);
                Console.WriteLine("Do you want to grill meat?");
                String grillResponse = Console.ReadLine();
                if (grillResponse == "yes")
                {
                    grill.increaseTemp(40);
                    Console.WriteLine("The grill is now at " + grill.temperature);
                    Console.WriteLine("Do you want to microwave chicken tendies?");
                    String microwaveResponse = Console.ReadLine();
                    if (microwaveResponse == "yes")
                    {
                        microwave.increaseTemp(20);
                        Console.WriteLine("The microwave is now at " + microwave.temperature);
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
                            Console.WriteLine($"The house has {house.numRooms} rooms"); //note the string interpolation - you don't have to add multiple things together
                        }

                    }
                }
            }
        }
    }
}