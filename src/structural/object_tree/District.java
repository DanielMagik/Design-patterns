package structural.object_tree;

import java.util.*;

public class District implements Area
{
    private final String name;
    private final List<Area> children = new ArrayList<>();

    public District(String name, List<Area> children)
    {
        this.name = name;
        add(children);
    }

    public void add(Area area)
    {
        children.add(area);
    }

    public void add(List<Area> areaList)
    {
        children.addAll(areaList);
    }

    public void remove(Area area)
    {
        children.remove(area);
    }

    public void remove(List<Area> areaList)
    {
        children.removeAll(areaList);
    }

    public void clear()
    {
        children.clear();
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void printStatus(int spaces)
    {
        printSpaces(spaces);
        System.out.print("This district is called " + getName() + "\n");
        printSpaces(spaces);
        System.out.print("{\n");

        for(Area area : children)
            area.printStatus(spaces + 2);

        printSpaces(spaces);
        System.out.print("}\n");
    }
    private void printSpaces(int spaces)
    {
        for(int i = 0; i < spaces; i++)
        System.out.print(" ");
    }
}
