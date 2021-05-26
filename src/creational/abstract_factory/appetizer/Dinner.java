package creational.abstract_factory.appetizer;

public class Dinner extends Appetizer
{
    @Override
    public void eat()
    {
        if (noEaten)
        {
            System.out.println("Dinner really fits to vine.");
            System.out.println("Now you are eating dinner.");
            noEaten = false;
        }
        else
        {
            System.out.println("You can't eat this dinner. It was eaten!");
        }
    }
}