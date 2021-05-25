package creational.builder.components.room;

import creational.builder.components.PrintInfoAble;
import creational.builder.components.enums.Color;

public class Door implements PrintInfoAble
{
    private Color color;
    private boolean hasKey;

    public Door(Color color, boolean hasKey)
    {
        this.color = color;
        this.hasKey = hasKey;
    }

    @Override
    public void printInfo()
    {
        if(color != null)
        {
            System.out.println("Color of door is " + color + ".");
        }
        if (hasKey)
            System.out.println("You can lock this door.");
        else
            System.out.println("You can't lock this door.");
    }
}
