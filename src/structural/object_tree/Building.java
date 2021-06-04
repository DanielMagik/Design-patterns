package structural.object_tree;

public class Building implements Area
{
    private String name;
    private String address;

    public Building(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void printStatus(int spaces)
    {
        for (int i = 0; i < spaces; i++)
            System.out.print(" ");
        System.out.print("This is building called " + getName() + ".Its address is "+ address+".\n");
    }
}
