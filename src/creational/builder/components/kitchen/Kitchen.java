package creational.builder.components.kitchen;

import creational.builder.components.enums.Color;
import creational.builder.components.room.Door;
import creational.builder.components.room.Room;
import creational.builder.components.room.Window;

import java.util.List;

public class Kitchen extends Room
{
    private Bakery bakery;
    private MicrowaveOven microwaveOven;

    public Kitchen(Color color, List<Window> windows, Door door, Bakery bakery, MicrowaveOven microwaveOven)
    {
        super(color, windows, door);
        this.bakery = bakery;
        this.microwaveOven = microwaveOven;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        if(microwaveOven != null)
        {
            System.out.println("We have microwave oven.");
            microwaveOven.printInfo();
        }
        if(bakery != null)
        {
            System.out.println("We have bakery.");
            bakery.printInfo();
        }
    }
}
