package structural.decorator.decorators;

import structural.decorator.senders.Sender;

public class SMSDecorator extends SenderDecorator
{

    public SMSDecorator(Sender wrappee)
    {
        super(wrappee);
    }

    @Override
    public void sendNotification()
    {
        super.sendNotification();
        System.out.println("Sending a SMS notification: " + getMessage());
    }

}
