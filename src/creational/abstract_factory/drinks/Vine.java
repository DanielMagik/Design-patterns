package creational.abstract_factory.drinks;

public class Vine extends Drink
{
    private String color;

    public Vine(int percents, String color)
    {
        super(percents);
        this.color = color;
    }

    @Override
    public void drink()
    {
        if (!full)
            System.out.println("You can't drink this vine. Glass is empty!");
        else
        {
            System.out.println("You are drinking vine.");
            if (percents > 20)
                System.out.println("This vine is strong!");
            if (color.equals("Pink"))
                System.out.println("Здесь так красиво, я перестаю дышать");
            full = false;
        }
    }
}