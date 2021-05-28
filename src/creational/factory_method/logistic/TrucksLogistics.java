package creational.factory_method.logistic;

import creational.factory_method.transport.Transport;
import creational.factory_method.transport.Truck;

public class TrucksLogistics extends Logistics
{
    @Override
    public Transport createTransport()
    {
        return new Truck();
    }
}
