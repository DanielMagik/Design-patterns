package creational.builder.components.room;

import creational.builder.components.PrintInfoAble;
import creational.builder.components.enums.Color;

import java.util.*;

public class Room implements PrintInfoAble
{
    private Color color;
    private List<Window> windows;
    private Door door;

    public Room(Color color, List<Window> windows, Door door)
    {
        this.color = color;
        this.windows = windows;
        this.door = door;
    }

    @Override
    public void printInfo()
    {
        if(color != null)
        {
            System.out.println("Color of walls is " + color + ".");
        }
        if(door != null)
        {
            System.out.println("We have door.");
            door.printInfo();
        }
        if(windows != null)
        {
            System.out.println("We have " + windows.size() + " windows.");
            for(Window w : windows)
                w.printInfo();
        }
    }
}
