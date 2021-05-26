package creational.abstract_factory.appetizer;

public abstract class Appetizer
{
    boolean noEaten;

    public Appetizer()
    {
        this.noEaten = true;
    }

    void printStatus()
    {
        if(noEaten)
            System.out.println("Appetizer is no eaten.");
        else
            System.out.println("Appetizer was eaten.");
    }
    public abstract void eat();
}
