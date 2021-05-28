package creational.factory_method.logistic;

import creational.factory_method.transport.Ship;
import creational.factory_method.transport.Transport;

public class ShipsLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Ship();
    }
}
