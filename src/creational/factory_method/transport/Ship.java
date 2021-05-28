package creational.factory_method.transport;

public class Ship implements Transport
{
    @Override
    public void show()
    {
        System.out.println("This is ship");
    }

    @Override
    public void run()
    {
        System.out.println("We are swim by ship. Watch out for pirates.");
    }
}
