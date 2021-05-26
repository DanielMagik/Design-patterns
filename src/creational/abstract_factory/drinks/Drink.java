package creational.abstract_factory.drinks;

public abstract class Drink
{
    boolean full;
    int percents;

    public Drink(int percents)
    {
        this.full = true;
        this.percents = percents;
    }

    void printStatus()
    {
        if (full)
            System.out.println("Glass is full.");
        else
            System.out.println("Glass is empty.");
    }
    public abstract void drink();
}
