package creational.factory_method.logistic;

import creational.factory_method.transport.Transport;

public abstract class Logistics
{
    public void perform()
    {
        System.out.println("Welcome to logistic program.");
        Transport transport = createTransport();
        transport.show();
        transport.run();
    }
    public abstract Transport createTransport();
}
