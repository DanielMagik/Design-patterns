package creational.abstract_factory.appetizer;

public class Herring extends Appetizer
{
    @Override
    public void eat()
    {
        if (noEaten)
        {
            System.out.println("Herring really fits to vodka.");
            System.out.println("Now you are eating herring.");
            noEaten = false;
        }
        else
        {
            System.out.println("You can't eat this herring. It was eaten!");
        }
    }
}
