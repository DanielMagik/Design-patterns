package creational.abstract_factory.drinks;

public class Vodka extends Drink
{
    private int price;

    public Vodka(int percents, int price)
    {
        super(percents);
        this.price = price;
    }

    @Override
    public void drink()
    {
        if (!full)
            System.out.println("You can't drink this vodka. Glass is empty!");
        else
        {
            System.out.println("You are drinking vodka.");
            if (percents > 40)
                System.out.println("This vodka is strong!");
            if (price<4)
                System.out.println("It is cheep vodka.");
            full = false;
        }
    }
}

