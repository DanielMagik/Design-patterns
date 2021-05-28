package creational.factory_method.transport;

public class Truck implements Transport
{
    @Override
    public void show()
    {
        System.out.println("This is truck.");
    }

    @Override
    public void run()
    {
        System.out.println("We are ride now by truck. Hope you haven't forgotten your cargo.");
    }
}
