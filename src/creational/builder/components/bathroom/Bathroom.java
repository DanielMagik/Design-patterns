package creational.builder.components.bathroom;

import creational.builder.components.enums.Color;
import creational.builder.components.room.Door;
import creational.builder.components.room.Room;
import creational.builder.components.room.Window;

import java.util.List;

public class Bathroom extends Room
{
    private Bath bath;
    private boolean hasMirror;

    public Bathroom(Color color, List<Window> windows, Door door, Bath bath, boolean hasMirror)
    {
        super(color, windows, door);
        this.bath = bath;
        this.hasMirror = hasMirror;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        if(bath != null)
        {
            System.out.println("We have bath.");
            bath.printInfo();
        }
        if(hasMirror)
            System.out.println("We have mirror.");
    }
}
