//this is a comment. it's not going to be interpreted by C# and is used to annotate important parts of the code
//classes are like blueprints. think of a factory - they need to know information on the parts needed to create a product
namespace seneca_project
{
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
}