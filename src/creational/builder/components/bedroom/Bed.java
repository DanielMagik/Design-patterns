package creational.builder.components.bedroom;

import creational.builder.components.PrintInfoAble;
import creational.builder.components.enums.Color;

public class Bed implements PrintInfoAble
{
    private BedType bedType;
    private Color color;
    private double softLevel;

    public Bed(BedType bedType, Color color, double softLevel)
    {
        this.bedType = bedType;
        this.color = color;
        this.softLevel = softLevel;
    }

    @Override
    public void printInfo()
    {
        if(bedType != null)
            System.out.println("Bed type is " + bedType + ".");
        if(color != null)
            System.out.println("Color of bed is " + color + ".");
        if(softLevel <= 0.5)
            System.out.println("Bed is soft.");
        else
            System.out.println("Bed is hard.");
    }
}
