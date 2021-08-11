using System;
//this is a comment. it's not going to be interpreted by C# and is used to annotate important parts of the code
//classes are like blueprints. think of a factory - they need to know information on the parts needed to create a product
namespace seneca_project
{
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
        public Car(int rpms = 0)
        { //constructor
            rpm = rpms;
            isDoorOpen = false;
        }
        //used to increment and decrement rpm
        public void openDoor() {
            isDoorOpen = true;
        }
        public void closeDoor() {
            isDoorOpen = false;
        }
        public void increaseRpm(int rpms)
        {
            rpm += rpms;
        }
        public void decreaseRpm(int rpms)
        {
            rpm -= rpms;
        }
    }
}