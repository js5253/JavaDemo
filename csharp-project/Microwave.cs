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
        public bool power
        {
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
        public void turnOn()
        {
            power = true;
        }
        public void turnOff()
        {
            power = false;
        }
        public void decreaseTemp(int temp)
        {
            temperature -= temp;
        }
    }
}