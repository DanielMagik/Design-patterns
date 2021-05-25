package creational.builder.components.livingroom;

import creational.builder.components.enums.Color;
import creational.builder.components.room.Door;
import creational.builder.components.room.Room;
import creational.builder.components.room.Window;

import java.util.List;

public class LivingRoom extends Room
{
    private TV tv;

    public LivingRoom(Color color, List<Window> windows, Door door, TV tv)
    {
        super(color, windows, door);
        this.tv = tv;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        if(tv != null)
        {
            System.out.println("We have tv.");
            tv.printInfo();
        }
        else
        {
            System.out.println("We dont have TV.");
        }
    }
}
