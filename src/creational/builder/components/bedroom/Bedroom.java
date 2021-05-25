package creational.builder.components.bedroom;

import creational.builder.components.enums.Color;
import creational.builder.components.room.Door;
import creational.builder.components.room.Room;
import creational.builder.components.room.Window;

import java.util.List;

public class Bedroom extends Room
{
    private Bed bed;

    public Bedroom(Color color, List<Window> windows, Door door, Bed bed)
    {
        super(color, windows, door);
        this.bed = bed;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        if(bed != null)
        {
            System.out.println("We have bed.");
            bed.printInfo();
        }
    }
}
