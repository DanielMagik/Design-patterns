package creational.builder.components.room;


import creational.builder.components.PrintInfoAble;
import creational.builder.components.enums.Color;

public class Window implements PrintInfoAble
{
    private int parts;
    private Color jambColor;
    private double cleanlinessLevel;
    private boolean openable;

    public Window(int parts, Color jambColor, double cleanlinessLevel, boolean openable)
    {
        this.parts = parts;
        this.jambColor = jambColor;
        this.cleanlinessLevel = cleanlinessLevel;
        this.openable = openable;
    }

    @Override
    public void printInfo()
    {
        System.out.println("Window has " + parts + " parts.");
        if(jambColor != null)
            System.out.println("Color of window is " + jambColor + ".");
        if(openable)
            System.out.println("You can open this window.");
        else
            System.out.println("You can't open this window.");
        if(cleanlinessLevel > 0.5 && cleanlinessLevel < 1)
            System.out.println("Window is enough clean.");
        else if(cleanlinessLevel == 1)
            System.out.println("Window is totally clean.");
        else
            System.out.println("Window is dirty.");
    }
}
