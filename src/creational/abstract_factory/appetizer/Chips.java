package creational.abstract_factory.appetizer;

public class Chips extends Appetizer
{
    @Override
    public void eat()
    {
        if(noEaten)
        {
            System.out.println("Chips really fit to beer.");
            System.out.println("Now you are eating chips.");
            noEaten = false;
        }
        else
        {
            System.out.println("You can't eat these chips. They were eaten!");
        }

    }
}
