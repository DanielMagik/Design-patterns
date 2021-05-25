package creational.builder.components.bathroom;

import creational.builder.components.PrintInfoAble;
import creational.builder.components.enums.Color;

public class Bath implements PrintInfoAble
{
    private Color color;
    private int capacity;
    private boolean hasWater;

    public Bath(Color color, int capacity, boolean hasWater)
    {
        this.color = color;
        this.capacity = capacity;
        this.hasWater = hasWater;
    }

    @Override
    public void printInfo()
    {
        if(color != null)
            System.out.println("The bath has " + color + " color.");
        System.out.println("The capacity of this bath is " + capacity + ".");
        if(hasWater)
            System.out.println("There is water in a bath.");
        else
            System.out.println("The bath is empty.");
    }
}
