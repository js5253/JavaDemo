//this is a comment. it's not going to be interpreted by C# and is used to annotate important parts of the code
//classes are like blueprints. think of a factory - they need to know information on the parts needed to create a product
namespace seneca_project
{
    public class Grill
    {
        //property of temperature
        public int temperature
        {
            get;
            set;
        }
        public bool power
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
        public void turnOn()
        {
            power = true;
        }
        public void turnOff()
        {
            power = false;
        }
    }
}